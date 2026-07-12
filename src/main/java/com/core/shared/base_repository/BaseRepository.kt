package com.core.shared.base_repository

import com.apollographql.apollo3.api.ApolloResponse
import com.apollographql.apollo3.exception.ApolloHttpException
import com.core.shared.error.GeneralApolloHttpStatusCodeException
import com.core.shared.error.GeneralException
import com.core.shared.error.IoException
import com.core.shared.error.ResponseErrorException
import com.core.shared.error.ResponseNotFoundErrorException
import com.core.shared.error.ResponseUnAuthorizedErrorException
import com.core.shared.error.SmartZoneError
import com.core.shared.state.State
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import retrofit2.Response
import java.io.IOException
import java.util.concurrent.CancellationException

const val CODE = "code"

abstract class BaseRepository<RequestDto, ResponseDto> {

    var dispatcher: CoroutineDispatcher = Dispatchers.IO

    suspend fun getOperationState(requestDto: RequestDto): State<ResponseDto> {
        return try {
            performApiCall(requestDto)
        } catch (e: IOException) {
            State.Error(getIoExceptionError(e))
        } catch (e: ApolloHttpException) {
            State.Error(e.handleApolloHttpException())
        } catch (e: Exception) {
            if (e is CancellationException) throw e
            State.Error(getGeneralExceptionError(e))
        }
    }

    abstract suspend fun performApiCall(requestDto: RequestDto): State<ResponseDto>


//    fun <T> getNotSuccessfulResponseState(response: ApolloResponse<*>) =
//        State.Error<T>(getNotSuccessfulResponseError(response))


    fun <T> getNotSuccessfulResponseState(response: Response<*>):State<T> {
        return when {
            response.code() == 401 -> State.Error(getUnauthorizedError(response.code()))
            else -> State.Error(getNotSuccessfulResponseError(response))
        }
    }


    private fun getIoExceptionError(e: IOException) = SmartZoneError.E(
        exception = IoException(cause = e),
        logMessage = "Failed to load data from Api with IOException:",
    )

    private fun ApolloHttpException.handleApolloHttpException(): SmartZoneError =
        when (statusCode) {
            401 -> getUnauthorizedError(statusCode)
            404 -> getNotFoundError(statusCode)
            else -> getGeneralApolloHttpError()
        }

    private fun getGeneralExceptionError(e: Exception) = SmartZoneError.E(
        exception = GeneralException(cause = e),
        logMessage = "Failed to load data from Api with General exception",
    )

//    private fun getNotSuccessfulResponseError(response: ApolloResponse<*>) = SmartZoneError.E(
//        exception = ResponseErrorException(),
//        logMessage = "Api request to url: ${response.errors}: failed with code ${response.extensions[CODE]}",
//        extraData = response
//    )

    private fun getNotSuccessfulResponseError(response: Response<*>) = SmartZoneError.E(
        exception = ResponseErrorException(),
        logMessage = "Api request to url: ${response.raw().request.url}: failed with code ${response.code()}",
        extraData = response
    )

    private fun getUnauthorizedError(code: Int) = SmartZoneError.E(
        exception = ResponseUnAuthorizedErrorException(),
        logMessage = "Api request to url: failed with code $code"
    )

    private fun getNotFoundError(code: Int) = SmartZoneError.E(
        exception = ResponseNotFoundErrorException(),
        logMessage = "Api request to url: failed with code $code"
    )

    private fun getGeneralApolloHttpError() = SmartZoneError.E(
        exception = GeneralApolloHttpStatusCodeException(),
        logMessage = "Api request to url: failed with code ApolloHttpError"
    )
}
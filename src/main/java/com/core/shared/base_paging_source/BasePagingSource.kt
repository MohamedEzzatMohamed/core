package com.core.shared.base_paging_source

//import androidx.paging.PagingSource
//import com.apollographql.apollo3.api.ApolloResponse
//import com.core.shared.error.GeneralException
//import com.core.shared.error.SmartZoneError
//import com.core.shared.error.SmartZoneException
//
//private const val CODE = "code"
//
//abstract class BasePagingSource<key : Any, value : Any> : PagingSource<key, value>() {
//
//    fun getNotSuccessfulError(response: ApolloResponse<*>): LoadResult<key, value>? {
//        return when {
//            response.hasErrors() -> LoadResult.Error(getGeneralException(response))
//            else -> null
//        }
//    }
//
//    private fun getGeneralException(response: ApolloResponse<*>): SmartZoneException {
//        val smartZoneError = SmartZoneError.E(
//            exception = GeneralException(),
//            logMessage = "Api request to url: ${response.errors}: failed with code ${response.extensions[CODE]}",
//            extraData = response
//        )
//        return SmartZoneException(smartZoneError)
//    }
//}
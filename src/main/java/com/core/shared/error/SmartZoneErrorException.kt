package com.core.shared.error

import androidx.annotation.Keep


open class SmartZoneErrorException(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)

@Keep
class GeneralException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class IoException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class ResponseErrorException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class ResponseUnAuthorizedErrorException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class ResponseUnAuthorizedAppErrorException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class ResponseNotFoundErrorException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class FailedToDecodeJwtException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class InvalidPhoneNumberException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class EmptyOldPasswordException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class OldPasswordLengthException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class EmptyNewPasswordException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class EmptyPasswordException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class EmptyPhoneNumberException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class PasswordIncorrectException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class CountryNotFoundException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class CityNotFoundException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class AreaNotFoundException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class ApplicationUpdateException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class ExceededNumberOfDevicesException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class PhoneNumberNotValidException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class PasswordLengthException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class GeneralApolloHttpStatusCodeException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class MobileReadyTakenException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class ParentMobileAlReadyTakenFromStudent(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class EmptyUserNameException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class UserNameLengthException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class EmptyParentMobileNumberException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class ParentMobileNumberIncorrectException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class EmailInvalidException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class EmptyGenderException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class ConfirmMobileNumberException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class OtpInvalidCodeException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class EmailAlreadyTakenException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class EmptyConfirmPasswordException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class ConfirmPasswordLengthException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class PasswordNotMatchedException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class MobileNotExistException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class StudentAndParentMobileMatchedException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class ConfirmMobileException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class IncorrectException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class CameraNotEnabled(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class ImageCaptureError(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class QrCodeScanException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class FawryUnpaidException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class ChargeWalletByCodeInvalidCodeException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class ChargeWalletByCodeIsUsedException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class StudentTransactionsHistoryPagingSourceException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class PostsByCourseGroupPagingSourceException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class QuestionBankByCourseGroupPagingSourceException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)



@Keep
class JoinNowCourseGroupsPagingSourceException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)



@Keep
class JoinNowUnitsByTeacherPagingSourceException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)



@Keep
class OldPasswordIsEqualToNewPassword(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)



@Keep
class LessonVideosPagingSourceException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)



@Keep
class EmptyImagePathException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)



@Keep
class OldStudentAndNewMobileMatchedException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class EmptyQuestionFieldException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)


@Keep
class EmptyAnswerFieldException(message: String? = null, cause: Throwable? = null) : SmartZoneErrorException(message, cause)

@Keep
class LoginErrorMessage(message: String? = null, cause: Throwable?= null): SmartZoneErrorException(message, cause)

@Keep
class RegisterNewAccountErrorMessage(message: String? = null, cause: Throwable?= null): SmartZoneErrorException(message, cause)


@Keep
class LogoutErrorMessage(message: String? = null, cause: Throwable?= null): SmartZoneErrorException(message, cause)









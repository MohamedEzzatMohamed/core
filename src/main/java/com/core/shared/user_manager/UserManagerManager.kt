package com.core.shared.user_manager

import com.core.shared.storage_manager.SHARED_PREFERENCE
import com.core.shared.storage_manager.StorageManager
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.qualifier.named

private const val LOGIN_USER_MODEL = "LOGIN_USER_MODEL"

class UserManagerManager : UserManagerHandler, KoinComponent {

    private val sharedPreference: StorageManager by inject(named(SHARED_PREFERENCE))
    override fun <T> saveUserData(loginUserModel: T) =
        sharedPreference.setObject(LOGIN_USER_MODEL, loginUserModel)

    override fun <T> getUserData(type: Class<T>) = sharedPreference.getObject(LOGIN_USER_MODEL, type)

    override fun clearUserDate() = sharedPreference.remove(LOGIN_USER_MODEL)
}
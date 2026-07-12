package com.core.shared.user_manager

interface UserManagerHandler {

    fun <T> saveUserData(loginUserModel: T)

    fun <T> getUserData(type: Class<T>): T?

    fun clearUserDate()

}
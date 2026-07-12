package com.core.shared.token_utils

interface TokenHandler {

    fun saveToken(token: String)

    fun getToken(): String?

    fun saveAppToken(appToken: String)

    fun getAppToken(): String?

    fun getPayload(): JwtPayload?

    fun getExpirationDate(): String

    fun clearToken()

    fun clearAppToken()

    fun handleSaveToken(token: String)

    fun handleSaveAppToken(appToken: String)
}
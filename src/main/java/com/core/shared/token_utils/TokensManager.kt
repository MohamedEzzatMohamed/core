package com.core.shared.token_utils

import com.core.shared.storage_manager.ENCRYPTED_SHARED_PREFERENCE
import com.core.shared.storage_manager.StorageManager
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.qualifier.named
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

const val TOKEN_KEY = "TOKEN_KEY"
const val APP_TOKEN_KEY = "APP_TOKEN_KEY"

class TokensManager : TokenHandler, KoinComponent {

    private val encryptedSharedPreference: StorageManager by
    inject(named(ENCRYPTED_SHARED_PREFERENCE))

    override fun saveToken(token: String) = encryptedSharedPreference.setString(TOKEN_KEY, token)

    override fun saveAppToken(appToken: String) = encryptedSharedPreference.setString(APP_TOKEN_KEY, appToken)

    override fun getToken() = encryptedSharedPreference.getString(TOKEN_KEY)

    override fun getAppToken() = encryptedSharedPreference.getString(APP_TOKEN_KEY)

    override fun getPayload() = getToken()?.getPayLoad()


    override fun getExpirationDate(): String {
        val epoch = getToken()?.getPayLoad()?.exp ?: 0L
        val date = Date(epoch * 1000)
        val dateFormat = SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault())
        return dateFormat.format(date)
    }

    override fun clearToken() = encryptedSharedPreference.remove(TOKEN_KEY)
    override fun clearAppToken() = encryptedSharedPreference.remove(APP_TOKEN_KEY)


    override fun handleSaveToken(token: String) {

        clearToken()
        saveToken(token)
    }

    override fun handleSaveAppToken(appToken: String) {

        clearAppToken()
        saveAppToken(appToken)
    }

}
package com.core.shared.base_fragment

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.net.Network
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat.checkSelfPermission
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.core.shared.base_activity.BaseActivity
import com.core.shared.connectivity.connectivity_manager.NetworkAwareComponent
import com.core.shared.country_setting_manager.CountrySettingHandler
import com.core.shared.error.GeneralException
import com.core.shared.error.IoException
import com.core.shared.error.ResponseErrorException
import com.core.shared.error.ResponseNotFoundErrorException
import com.core.shared.error.ResponseUnAuthorizedAppErrorException
import com.core.shared.error.ResponseUnAuthorizedErrorException
import com.core.shared.error.SmartZoneError
import com.core.shared.error.SmartZoneErrorHandler
import com.core.shared.localization_operation.language_setting.LanguageSelectedSettingHandler
import com.core.shared.localization_operation.local_helper.LocaleHelper
import com.core.shared.localization_operation.local_helper.LocaleHelperHandler
import com.core.shared.storage_manager.SHARED_PREFERENCE
import com.core.shared.storage_manager.StorageManager
import com.core.shared.user_manager.UserManagerHandler
import com.core.shared.utils.dialogs.smartzone_progress_dialog.SmartZoneProgressDialog
import com.core.shared.utils.extensions.showToast
import com.jakewharton.processphoenix.ProcessPhoenix
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.parameter.parametersOf
import org.koin.core.qualifier.named

abstract class BaseFragment<dataBinding : ViewDataBinding> : Fragment(), KoinComponent,
    NetworkAwareComponent {

//    abstract val binding: dataBinding
    private var _binding: dataBinding? = null

    // This is what your subclasses will use
    val binding: dataBinding get() = _binding ?: throw IllegalStateException("Binding accessed outside of lifecycle")

    protected val connectivityManager get() = (activity as? BaseActivity<*, *>)?.connectivityManager


    protected val localeHelperHandler: LocaleHelperHandler by inject()

    protected val languageSelectedSettingHandler: LanguageSelectedSettingHandler by inject()

    protected val sharedPreference: StorageManager by inject(named(SHARED_PREFERENCE))

    protected val userManagerHandler: UserManagerHandler by inject()

    protected val countrySettingHandler: CountrySettingHandler by inject()

    private val smartZoneProgressDialog: SmartZoneProgressDialog by inject {
        parametersOf(requireActivity())
    }


    private val inputMethodManager
        get() = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager


    override fun onStart() {
        super.onStart()
        checkOnSelfPermission()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        if (!languageSelectedSettingHandler.isSelectedLanguage()) {
            (context as? Activity)?.let {
                localeHelperHandler.setLocale(it, LocaleHelper.SupportedLanguage.ARABIC)
            }
        }
        _binding = onCreateBinding(inflater, container)
        return binding.root
    }

    abstract fun onCreateBinding(inflater: LayoutInflater, container: ViewGroup?): dataBinding

    override fun onDestroyView() {
        super.onDestroyView()
        // This stops the leak!
        _binding?.unbind()
        _binding = null
    }

    fun Int.localize() = getString(this)

    fun Int.localize(vararg args: Any) = getString(this, *args)

    fun Int.showShortToast() = requireActivity().showToast(localize(), Toast.LENGTH_SHORT)

    fun showShortToast(message: String) = requireActivity().showToast(message, Toast.LENGTH_SHORT)

    fun Int.showLongToast() = showLongToast(localize())

    fun showLongToast(message: String) = requireActivity().showToast(message)


    fun showProgressDialog() = smartZoneProgressDialog.show()

    fun hideProgressDialog() = smartZoneProgressDialog.dismiss()

    override fun onNetworkAvailable(network: Network) {
        //TODO NO NEED SHOW ANY MESSAGE HERE
    }

    override fun onNetworkLost(network: Network) {
        //TODO NO NEED SHOW ANY MESSAGE HERE
    }


    protected fun showKeyboard(view: View) =
        inputMethodManager?.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)


    protected fun hideKeyboard(view: View) =
        inputMethodManager?.hideSoftInputFromWindow(view.windowToken, 0)


    protected fun showDelayProgressDialog(callbackAction: () -> Unit) {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
            showProgressDialog()
            delay(400)
            callbackAction()
            hideProgressDialog()
        }}
    }


    protected fun handleApplicationRestart() = ProcessPhoenix.triggerRebirth(requireActivity())

    fun SmartZoneError.handleError(callback: SmartZoneError.() -> Unit) {
        (activity as? SmartZoneErrorHandler)?.handleError(this) {
            val message = logMessage ?: ""
            when (exception) {
                is GeneralException -> handleGeneralExceptionError(message)
                is IoException -> handleIoExceptionError(message)
                is ResponseErrorException -> handleGeneralResponseError(message)
                is ResponseUnAuthorizedErrorException -> handleUnauthorizedError(message)
                is ResponseUnAuthorizedAppErrorException -> handleUnauthorizedAppError(message)
                is ResponseNotFoundErrorException -> handleNotFoundError(message)
                else -> handleOtherErrors(this)
            }
        }
        callback()
    }


    private val permissions = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        arrayOf(Manifest.permission.POST_NOTIFICATIONS)
    } else {
        emptyArray()
    }

    private fun checkOnSelfPermission() {
        if (permissions.isEmpty() || permissions.all {
                checkSelfPermission(requireContext(), it) == PERMISSION_GRANTED
            }) {
            onPermissionsGranted()
        } else {
            requestMultiplePermissionsLauncher.launch(permissions)
        }
    }

    private val requestMultiplePermissionsLauncher =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
            permissions.entries.filter { !it.value }.forEach {
                onPermissionDenied(it.key)
                return@registerForActivityResult
            }
            onPermissionsGranted()
        }

    protected open fun onPermissionsGranted() {}

    protected open fun onPermissionDenied(permission: String?) {}


    protected open fun handleOtherErrors(error: SmartZoneError): SmartZoneError {
        return error
    }

    protected open fun handleGeneralExceptionError(message: String) = showShortToast(message)


    protected open fun handleIoExceptionError(message: String) = showShortToast(message)


    protected open fun handleGeneralResponseError(message: String) = showShortToast(message)


    protected open fun handleUnauthorizedError(message: String) = showShortToast(message)


    protected open fun handleUnauthorizedAppError(message: String) = showShortToast(message)


    protected open fun handleNotFoundError(message: String) = showShortToast(message)

}
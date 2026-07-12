package com.core.shared.camerax

import android.Manifest
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.widget.AppCompatImageView
import androidx.camera.core.Camera
import androidx.camera.core.CameraSelector
import androidx.camera.core.Preview
import androidx.camera.core.UseCase
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.core.shared.R.drawable.ic_flash_off
import com.core.shared.R.drawable.ic_flash_on
import com.core.shared.R.string.allow_camera_instructions
import com.core.shared.R.string.dnyPermissionMessage
import com.core.shared.error.CameraNotEnabled
import com.core.shared.error.ImageCaptureError
import com.core.shared.error.SmartZoneError
import com.core.shared.error.SmartZoneErrorHandler
import com.core.shared.utils.CommonUtils
import com.core.shared.utils.CommonUtils.showPermissionErrorPopup
import com.core.shared.utils.CommonUtils.startApplicationSetting
import com.core.shared.utils.dialogs.smart_zone_dialog.SmartZoneDialogBuilder


abstract class BaseCameraFragment<dataBinding : ViewDataBinding> : Fragment(),
    SmartZoneErrorHandler {

    abstract val binding: dataBinding

    open val flashView: View? = null
    open val switchCameraIv: View? = null
    abstract val previewView: View
    private var isTorchOn = false
    private var cameraLens = CameraSelector.LENS_FACING_BACK
    private val processCameraProvider by lazy { ProcessCameraProvider.getInstance(requireActivity()) }
    private val requestPermission = setRequestPermission()
    private val cameraProvider: ProcessCameraProvider by lazy { processCameraProvider.get() }

    private fun setRequestPermission() =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) startCamera() else handleError(getCameraPermissionError())
        }

    private fun startCamera() {
        processCameraProvider.addListener(
            { setUpCameraConfiguration() }, ContextCompat.getMainExecutor(requireActivity())
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        setOnSwitchCameraIvClicked()
        return binding.root
    }

    override fun handleError(error: SmartZoneError, callback: SmartZoneError.() -> Unit) {
        error.logError()
        when (error.exception) {
            is CameraNotEnabled -> showCameraNotEnabledPopUp()
            is ImageCaptureError -> showImageCaptureErrorPopUp()
        }
        callback(error)
    }

    private fun showCameraNotEnabledPopUp() {
        showPermissionErrorPopup(
            requireActivity(), dnyPermissionMessage, allow_camera_instructions
        ) { activity?.let { startApplicationSetting(it) } }
    }


    private fun showImageCaptureErrorPopUp() {
        SmartZoneDialogBuilder(requireActivity())
            .setIcon(com.core.shared.R.drawable.ic_vector_warning)
            .setTitle(com.core.shared.R.string.canNotCaptureAnImage)
            .setTopButton(com.core.shared.R.string.ok) { }
            .setCancelable(false)
            .show()
    }


    private fun getCameraPermissionError() = SmartZoneError.W(
        exception = CameraNotEnabled(),
        logMessage = "Camera dny in device",
        extraData = CommonUtils.getDeviceInformation()
    )

    override fun onStart() {
        super.onStart()
        requestPermission.launch(Manifest.permission.CAMERA)
    }

    private fun buildCameraSelector() =
        CameraSelector.Builder().requireLensFacing(cameraLens).build()


    private fun setOnSwitchCameraIvClicked() = switchCameraIv?.setOnClickListener {
        val isBackCamera = (cameraLens == CameraSelector.LENS_FACING_BACK)
        setBackCameraLens(isBackCamera)
        handleFlashIvVisibility(isBackCamera)
        setUpCameraConfiguration()
    }


    private fun buildPreviewUseCase(): Preview {
        return Preview.Builder().build().also { preview ->
            preview.setSurfaceProvider((previewView as PreviewView).surfaceProvider)
        }
    }

    private fun setOnFlashViewClicked(camera: Camera) {
        flashView?.setOnClickListener {
            val drawableRes = if (isTorchOn) ic_flash_off else ic_flash_on
            (flashView as? AppCompatImageView)?.setImageResource(drawableRes)
            isTorchOn = !isTorchOn
            camera.cameraControl.enableTorch(isTorchOn)
        }
    }

    private fun handleFlashIvVisibility(isBackCamera: Boolean) {
        flashView?.isVisible = !isBackCamera
    }

    private fun setBackCameraLens(isBackCamera: Boolean) {
        cameraLens = if (isBackCamera) {
            CameraSelector.LENS_FACING_FRONT
        } else {
            CameraSelector.LENS_FACING_BACK
        }
    }

    private fun setUpCameraConfiguration() {
        cameraProvider.unbindAll()
        val camera = cameraProvider.bindToLifecycle(
            this, buildCameraSelector(), buildPreviewUseCase(), *getUseCase()
        )
        camera.cameraControl.cancelFocusAndMetering()
        setOnFlashViewClicked(camera)
    }

    open fun handleTakePictureButton() {}

    abstract fun getUseCase(): Array<UseCase>
}
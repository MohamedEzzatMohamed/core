package com.core.shared.camerax.image_capture

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Size
import android.view.View
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageCaptureException
import androidx.camera.core.ImageProxy
import androidx.camera.core.UseCase
import androidx.core.view.isVisible
import androidx.fragment.app.setFragmentResult
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.core.shared.camerax.BaseCameraFragment
import com.core.shared.databinding.FragmentImageCaptureBinding
import com.core.shared.error.ImageCaptureError
import com.core.shared.error.SmartZoneError
import com.core.shared.utils.CommonUtils
import com.core.shared.camerax.model.SerializableBitmap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.nio.ByteBuffer
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class ImageCaptureFragment : BaseCameraFragment<FragmentImageCaptureBinding>() {

    override val binding by lazy { FragmentImageCaptureBinding.inflate(layoutInflater) }

    private val executor: ExecutorService by lazy { Executors.newCachedThreadPool() }
    private val imageCaptureUseCase by lazy { buildImageCaptureUseCase() }
    override val previewView: View get() = binding.previewView
    override val flashView: View get() = binding.flashIv
    override val switchCameraIv: View get() = binding.switchCameraIv

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imageCaptureButtonClicked(imageCaptureUseCase)
    }

    override fun getUseCase(): Array<UseCase> = arrayOf(imageCaptureUseCase)

    private fun FragmentImageCaptureBinding.imageCaptureButtonClicked(imageCapture: ImageCapture) {
        imageCaptureBtn.setOnClickListener {
            imageCapture.takeImage()
        }
    }

    private fun ImageCapture.takeImage() {
        takePicture(executor, imageCaptureCallback())
    }

    private fun imageCaptureCallback() = object : ImageCapture.OnImageCapturedCallback() {
        override fun onCaptureSuccess(image: ImageProxy) {
            getImageFromImageCapture(image)
        }

        override fun onError(exception: ImageCaptureException) {
            activity?.let {
                lifecycleScope.launch(Dispatchers.Main) {
                    handleError(getImageCaptureError(exception))
                }
            }
        }
    }

    private fun getImageFromImageCapture(image: ImageProxy) {
        lifecycleScope.launch {
            val imageBitmap = imageProxyToBitmap(image)
            imageBitmap?.let {
                showImage(it)
                onOkBtnClicked(it, image)
                onRetryBtnClicked(image)
            }
        }
    }

    private fun imageProxyToBitmap(image: ImageProxy): Bitmap? {
        val buffer: ByteBuffer = image.planes[0].buffer
        val bytes = ByteArray(buffer.remaining())
        buffer.get(bytes)
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.size, null)
    }

    private fun showImage(imageBitmap: Bitmap) {
        activity?.let {
            lifecycleScope.launch(Dispatchers.Main) {
                Glide.with(it).load(imageBitmap).into(binding.showImageView)
                showImageLayout(true)
            }
        }
    }

    private fun onOkBtnClicked(imageBitmap: Bitmap, image: ImageProxy) =
        lifecycleScope.launch(Dispatchers.Main) {
            binding.okayBtn.setOnClickListener {
                lifecycleScope.launch(Dispatchers.Default) {
                    setFragmentResult(imageBitmap)
                    image.close()
                }
            }
        }


    private fun setFragmentResult(imageBitmap: Bitmap) {
        val resultBundle = Bundle()
        resultBundle.putSerializable(ImageRequest.IMAGE_KEY, SerializableBitmap(imageBitmap))
        setFragmentResult(ImageRequest.IMAGE_REQUEST_KEY, resultBundle)
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                findNavController().navigateUp()
            }
        }
    }

    private fun onRetryBtnClicked(image: ImageProxy) = lifecycleScope.launch(Dispatchers.Main) {
        binding.retryBtn.setOnClickListener {
            image.close()
            showImageLayout(false)
        }
    }


    private fun showImageLayout(isShowing: Boolean) {
        binding.previewCameraLayout.isVisible = !isShowing
        binding.showImageLayout.isVisible = isShowing
    }

    private fun buildImageCaptureUseCase(): ImageCapture {
        return ImageCapture.Builder().setTargetResolution(Size(1080, 1920)).build()
    }

    private fun getImageCaptureError(exception: ImageCaptureException) = SmartZoneError.E(
        exception = ImageCaptureError(cause = exception),
        logMessage = "Error when capturing image",
        extraData = CommonUtils.getDeviceInformation()
    )
}

object ImageRequest {
    const val IMAGE_KEY = "IMAGE_BITMAP"
    const val IMAGE_REQUEST_KEY = "IMAGE_REQUEST"
}
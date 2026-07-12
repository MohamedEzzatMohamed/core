package com.core.shared.camerax.scan_qrcode.qrcode_fragment

import android.view.View
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.UseCase
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.core.shared.camerax.BaseCameraFragment
import com.core.shared.camerax.utils.Constants.FRAGMENT_QR_CODE_KEY
import com.core.shared.camerax.utils.Constants.FRAGMENT_QR_RESULT_REQUEST_KEY
import com.core.shared.camerax.scan_qrcode.qrcode_manager.QrCodeAnalyzer
import com.core.shared.camerax.scan_qrcode.scanQrcodeActivity.QrScannerHandler
import com.core.shared.camerax.scan_qrcode.scanQrcodeActivity.ScanQrcodeActivity
import com.core.shared.databinding.FragmentScanQrCodeBinding
import com.core.shared.error.SmartZoneErrorHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.concurrent.Executors

class ScanQrCodeFragment : BaseCameraFragment<FragmentScanQrCodeBinding>(), SmartZoneErrorHandler {


    override val binding by lazy { FragmentScanQrCodeBinding.inflate(layoutInflater) }


    private val imageAnalysisUseCase by lazy { getQrCodeImageAnalysisUseCase() }
    override val previewView: View get() = binding.previewView
    override val flashView: View get() = binding.flashIv
    override val switchCameraIv: View get() = binding.switchCameraIv

    override fun getUseCase(): Array<UseCase> = arrayOf(imageAnalysisUseCase)

    private fun getQrCodeImageAnalysisUseCase(): ImageAnalysis {
        val imageAnalysis = getImageAnalysis()
        val executor = Executors.newCachedThreadPool()
        imageAnalysis.setAnalyzer(executor, getQrCodeImageAnalyzer())
        return imageAnalysis
    }

    private fun getImageAnalysis() =
        ImageAnalysis
            .Builder()
            .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
            .build()


    private fun getQrCodeImageAnalyzer() = QrCodeAnalyzer {
        lifecycleScope.launch(Dispatchers.Main) {
            handleQrCodeResult(it)
        }
    }


    private fun handleQrCodeResult(qrResult: String) {
        val isScanQrcodeActivity = activity is ScanQrcodeActivity
        if (isScanQrcodeActivity) {
            (activity as? QrScannerHandler)?.onQrCodeScanned(qrResult)
            return
        }
        setFragmentResult(qrResult)
    }

    private fun setFragmentResult(qrResult: String) {
        val resultBundle = bundleOf(FRAGMENT_QR_CODE_KEY to qrResult)
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                setFragmentResult(FRAGMENT_QR_RESULT_REQUEST_KEY, resultBundle)
                findNavController().navigateUp()
            }
        }
    }
}
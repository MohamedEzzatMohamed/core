package com.core.shared.camerax.scan_qrcode.qrcode_manager

import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import com.google.mlkit.vision.barcode.BarcodeScannerOptions
import com.google.mlkit.vision.barcode.BarcodeScanning
import com.google.mlkit.vision.barcode.common.Barcode
import com.google.mlkit.vision.common.InputImage

@androidx.annotation.OptIn(androidx.camera.core.ExperimentalGetImage::class)
class QrCodeAnalyzer(private val onQrCodesDetected: (qrCode: String) -> Unit) :
    ImageAnalysis.Analyzer {

    override fun analyze(imageProxy: ImageProxy) {
        handleAnalyzeImage(imageProxy)
    }


    private fun handleAnalyzeImage(imageProxy: ImageProxy) {
        val barcodeScanning = BarcodeScanning.getClient(getBarcodeScannerOptions())
        val mediaImage = imageProxy.image ?: return
        val image = InputImage.fromMediaImage(mediaImage, imageProxy.imageInfo.rotationDegrees)
        barcodeScanning.process(image).addOnSuccessListener { barcodes ->
            val barcode = barcodes.getOrNull(0) ?: return@addOnSuccessListener
            val codeValue = barcode.rawValue ?: ""
            onQrCodesDetected(codeValue)
        }.addOnCompleteListener { imageProxy.close() }
    }

    private fun getBarcodeScannerOptions() =
        BarcodeScannerOptions.Builder().setBarcodeFormats(Barcode.FORMAT_QR_CODE).build()
}

package com.core.shared.camerax.scan_qrcode.scanQrcodeActivity

interface QrScannerHandler {
    fun onQrCodeScanned(qrCodeResult: String)
}
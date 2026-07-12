package com.core.shared.camerax.scan_qrcode.scanQrcodeActivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.databinding.DataBindingUtil
import com.core.shared.R
import com.core.shared.camerax.utils.Constants.QR_CODE
import com.core.shared.databinding.ActivityScanQrcodeBinding

class ScanQrcodeActivity : AppCompatActivity(), QrScannerHandler {

    lateinit var binding: ActivityScanQrcodeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_scan_qrcode)
        hideSystemBars()
    }

    private fun hideSystemBars() {
        WindowInsetsControllerCompat(window, window.decorView)
            .hide(WindowInsetsCompat.Type.systemBars())
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            hideSystemBars()
        }
    }

    override fun onQrCodeScanned(qrCodeResult: String) {
        val intent = Intent().putExtra(QR_CODE, qrCodeResult)
        setResult(RESULT_OK, intent)
        finish()
    }
}
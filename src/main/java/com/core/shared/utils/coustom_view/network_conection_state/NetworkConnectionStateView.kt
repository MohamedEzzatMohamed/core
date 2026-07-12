package com.core.shared.utils.coustom_view.network_conection_state

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.core.shared.databinding.LayoutNetworkConnectionStateBinding
import com.core.shared.utils.extensions.setOnGoToConnectionSettingClicked
import org.koin.core.component.KoinComponent

class NetworkConnectionStateView(context: Context, attributes: AttributeSet? = null) :
    FrameLayout(context, attributes), KoinComponent {


    private val binding by lazy {
        LayoutNetworkConnectionStateBinding.inflate(LayoutInflater.from(context), this, true)
    }

    init {
        setOnTrayAgainBtnClicked()
    }

    private fun setOnTrayAgainBtnClicked() =
        binding.tryAgainBtn.setOnGoToConnectionSettingClicked(context)

}
package com.core.shared.check_network_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.core.shared.base_fragment.BaseFragment
import com.core.shared.databinding.FragmentCheckNetworkBinding
import com.core.shared.utils.fragment_extensions.onBackPressed

class CheckNetworkFragment : BaseFragment<FragmentCheckNetworkBinding>() {

    //    override val binding by lazy { FragmentCheckNetworkBinding.inflate(layoutInflater) }
    override fun onCreateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentCheckNetworkBinding {
        return FragmentCheckNetworkBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkOnNetworkConnection()
        onBackPressed()
    }


    private fun checkOnNetworkConnection() {
        connectivityManager?.isNetworkConnected?.observe(viewLifecycleOwner) {
            if (!it) return@observe
            findNavController().popBackStack()
        }
    }


    private fun onBackPressed() = onBackPressed {
        findNavController().popBackStack()
    }
}
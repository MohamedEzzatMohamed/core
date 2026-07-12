package com.core.shared.features.country_code_fragment.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.core.shared.base_fragment.BaseFragment
import com.core.shared.databinding.FragmentShowingCountryCodeBinding
import com.core.shared.features.country_code_fragment.adapter.CountriesCodeAdapter
import com.core.shared.features.country_code_fragment.domain.viewmodel.ShowCountryCodeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

const val SELECTED_STUDENT_COUNTRY_CODE = "SELECTED_STUDENT_COUNTRY_CODE"

const val SELECTED_PARENT_COUNTRY_CODE = "SELECTED_PARENT_COUNTRY_CODE"

class ShowCountryCodeFragment : BaseFragment<FragmentShowingCountryCodeBinding>() {

    //    override val binding by lazy { FragmentShowingCountryCodeBinding.inflate(layoutInflater) }
    override fun onCreateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentShowingCountryCodeBinding {
        return FragmentShowingCountryCodeBinding.inflate(inflater, container, false)
    }

    private val viewModel: ShowCountryCodeViewModel by viewModel()

    private lateinit var countriesCodeAdapter: CountriesCodeAdapter

    private val listOfCountryCode get() = viewModel.getCountryCodeList()
    private val selectedStudentCountryCode
        get() = arguments?.getBoolean(SELECTED_STUDENT_COUNTRY_CODE) ?: false

    private val isSelectedStudentStudentCountryCode
        get() = if (selectedStudentCountryCode) {
            SELECTED_STUDENT_COUNTRY_CODE
        } else {
            SELECTED_PARENT_COUNTRY_CODE
        }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.setUpView()
    }


    private fun FragmentShowingCountryCodeBinding.setUpView() {
        setOnBackClickedClicked()
        setCountryCodeAdapter()
    }

    private fun FragmentShowingCountryCodeBinding.setOnBackClickedClicked() =
        closeIv.setOnClickListener {
            findNavController().popBackStack()
        }

    private fun FragmentShowingCountryCodeBinding.setCountryCodeAdapter() {
        countriesCodeAdapter = CountriesCodeAdapter(listOfCountryCode) {
            val bundle = bundleOf(isSelectedStudentStudentCountryCode to it)
            setFragmentResult(isSelectedStudentStudentCountryCode, bundle)
            findNavController().navigateUp()
        }
        countryCodeRv.adapter = countriesCodeAdapter
    }
}
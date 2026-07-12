package com.core.shared.features.country_code_fragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.core.shared.databinding.ItemCountriesCodeBinding
import com.core.shared.features.country_code_fragment.domain.model.CountryCodeEntity
import com.core.shared.utils.CommonUtils.load

class CountriesCodeAdapter(
    private val countryItem: MutableList<CountryCodeEntity>,
    private val onItemClicked: (String) -> Unit
) : RecyclerView.Adapter<CountriesCodeAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemCountriesCodeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val items = countryItem[position]
        viewHolder.bind(items)
    }

    override fun getItemCount() = countryItem.size


    inner class ViewHolder(private val binding: ItemCountriesCodeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: CountryCodeEntity) {
            binding.setupViews(item)
        }

        private fun ItemCountriesCodeBinding.setupViews(item: CountryCodeEntity) {
            countryNameTv.text = binding.root.context.getString(item.countryName)
            countryCodeTv.text = item.countryCode.countryCodeValue
            countryFlagIv.load(binding.root.context, item.imagePath)
            root.setOnClickListener { onItemClicked(item.countryCode.countryCodeValue) }
        }
    }
}
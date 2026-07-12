package com.core.shared.fawry_sdk_manager.model.launch_anonymos_sdk_model

import com.fawry.fawrypay.models.BillItems
import com.fawry.fawrypay.models.PayableItem

data class BillItemsUiModel(
    val itemId: String?,
    val itemSKU: String? = null,
    val description: String?,
    val quantity: String?,
    val earningRuleId: String? = null,
    val variantCode: String? = null,
    val price: String?,
    val specialRequest: String? = null,
    val imageUrl: String? = null,
    val addons: ArrayList<PayableItem>? = null
) {
    fun toChargeListItems(): ArrayList<PayableItem> {
        val chargeItems = arrayListOf<PayableItem>()
        val billItem = BillItems(
            itemId = itemId,
            itemSKU = itemSKU,
            description = description,
            quantity = quantity,
            earningRuleId = earningRuleId,
            variantCode = variantCode,
            price = price,
            specialRequest = specialRequest,
            imageUrl = imageUrl,
            addons = addons
        )
        chargeItems.add(billItem)
        return chargeItems
    }
}

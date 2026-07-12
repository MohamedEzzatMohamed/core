package com.core.shared.utils

import android.text.InputFilter
import android.text.Spanned
import java.util.regex.Pattern

class DecimalDigitsInputFilter(beforeDecimalPoint: Int, afterDecimalPoint: Int) : InputFilter {

    private val regex = "(\\d{0,$beforeDecimalPoint})|(\\d{0,$beforeDecimalPoint}\\.\\d{0,$afterDecimalPoint})"
    private val pattern = Pattern.compile(regex)

    override fun filter(
        source: CharSequence, start: Int, end: Int, dest: Spanned, dstart: Int, dend: Int
    ): CharSequence? {
        val removeRange = pattern.matcher(dest.removeRange(dstart, dend)).matches()
        val replaceRange = pattern.matcher(dest.replaceRange(dstart, dend, source)).matches()
        return if (source.isEmpty()) {
            if (removeRange) null else dest.subSequence(dstart, dend)
        } else {
            if (replaceRange) null else ""
        }
    }
}
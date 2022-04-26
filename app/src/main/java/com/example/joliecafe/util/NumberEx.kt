package com.example.joliecafe.util

import java.text.DecimalFormat

fun Long.decimalFormat(): String =
    if (this == this.toInt().toLong()) this.toInt().toString() else DecimalFormat("0.00").format(
        this
    )

fun Long.convertPrice(): String {
    val formatter = DecimalFormat("###,###,###")
    return formatter.format(this) + "₫"
}
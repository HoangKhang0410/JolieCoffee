package com.example.joliecafe.data

data class Product(
    val id: Int,
    val name: String,
    val description: String?,
    val image: Int,
    val category: String,
    val price: Long,
    val rating: Float
)

package com.example.shoeshopapp.data

import androidx.annotation.StringRes

data class ShoesModel (
    @StringRes
    val Id: Int,
    val showName : String,
    val imageId: Int,
    val shoeSize: String,
    val brandId: Int,
    val showDescription: String
)
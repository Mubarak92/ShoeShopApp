package com.example.shoeshopapp.data

import android.util.Log
import com.example.shoeshopapp.R

class ShoesList {
    var shoesListItem: MutableList<ShoesModel> = mutableListOf(

        ShoesModel(
            1,
            "Nike",
            R.drawable.nike_shoe,

            "Size 40", R.drawable.ic_logo_nike_svg, "this is shoes"
        ),
        ShoesModel(
            2,
            "Adidas",
            R.drawable.adidas_shoe,
            "Size 35",
            R.drawable.adidas_logo,
            "this is shoes"
        ),
        ShoesModel(
            3,
            "Under Armor",
            R.drawable.under_armor_shoe,
            "Size 30", R.drawable.under_armour_logo, "this is shoes"
        ),
        ShoesModel(
            4,
            "Sketchers",
            R.drawable.sketchers_shoe,
            "Size 45", R.drawable.sketchers_shoe, "this is shoes"
        ),
        ShoesModel(
            5,
            "puma",
            R.drawable.puma_shoe,
            "Size 44", R.drawable.puma_logo, "this is shoes"
        ),

        )


    fun loadData(): MutableList<ShoesModel> {
        return shoesListItem
    }

    fun addItem(item : ShoesModel) {
        Log.e("TAG", "addItem: $item and Size is ${shoesListItem.size}",)
        shoesListItem.add(item)

        Log.e("TAG", " Size is ${shoesListItem.size}",)


    }


}
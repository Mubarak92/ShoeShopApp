package com.example.shoeshopapp.data

import com.example.shoeshopapp.R

class DataSource {
    fun loadData():List<ShoesModel>{
        return listOf(
            ShoesModel(1,"Nike1",R.drawable.ic_logo_nike_svg,R.drawable.ic_logo_nike_svg,"R.string.descript1"),
            ShoesModel(2,"R.string.product1",R.drawable.ic_logo_nike_svg,R.drawable.ic_logo_nike_svg,"R.string.descript1"),
            ShoesModel(3,"R.string.product1",R.drawable.ic_logo_nike_svg,R.drawable.ic_logo_nike_svg,"R.string.descript1"),

            )
    }
}
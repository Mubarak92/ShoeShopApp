package com.example.shoeshopapp.ui

import android.util.Log
import androidx.lifecycle.*
import com.example.shoeshopapp.R
import com.example.shoeshopapp.data.ShoesList
import com.example.shoeshopapp.data.ShoesModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class ItemsViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    private val _getAllItems = MutableLiveData<List<ShoesModel>>()
    val getAllItems: LiveData<List<ShoesModel>> = _getAllItems

    val filteredData: MutableLiveData<String> =
        savedStateHandle.getLiveData ("login")


    fun setQuery(query: String) {
        savedStateHandle["login"] = query
    }

    init {
        sendData()
    }
    fun sendData() {
        viewModelScope.launch {
            _getAllItems.value = ShoesList().loadData()

        }

    }

    fun addNewItem(idShoe: Int,showName : String,shoeSize: String,showDescription: String) {

        val newItem = getNewItemEntry(idShoe,showName, R.drawable.ic_logo_nike_svg,shoeSize,R.string.descript1,showDescription)

        insertItem(newItem)

    }



    // convert to ShoesModel(Id,showName,imageId,shoeSize,brandId,showDescription)
    private fun getNewItemEntry(idShoe: Int,showName : String,imageId: Int,shoeSize: String,brandId: Int,showDescription: String): ShoesModel {
        return ShoesModel(idShoe,showName,imageId,shoeSize,brandId,showDescription)
    }

    // insert to Shoelist
    private fun insertItem(item: ShoesModel) {

        viewModelScope.launch { ShoesList().addItem(item) }

    }

}
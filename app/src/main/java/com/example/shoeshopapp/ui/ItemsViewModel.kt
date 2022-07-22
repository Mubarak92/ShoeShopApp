package com.example.shoeshopapp.ui

import android.content.ClipData
import android.content.ClipDescription
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shoeshopapp.data.DataSource
import com.example.shoeshopapp.data.ShoesModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class ItemsViewModel : ViewModel() {

    private val _getAllItems = MutableLiveData<List<ShoesModel>>()
    val getAllItems: LiveData<List<ShoesModel>> = _getAllItems

    init {
        sendData()
    }
    fun sendData() {
        viewModelScope.launch {
//           val dataset = DataSource().loadData()
            _getAllItems.value = DataSource().loadData()

        }

    }
    private fun insertItem(item: ShoesModel) {
        viewModelScope.launch { itemDao.insert(item) }
    }
    fun addNewItem(itemName: String, itemBrand: Int, itemSize: String,itemDescription: String) {
        val newItem = getNewItemEntry(itemName, itemBrand, itemSize,itemDescription )
        insertItem(newItem)

    }
    private fun getNewItemEntry(itemName: String, itemPrice: String, itemCount: String): DataClass {
        return ShoesModel(showName = itemName, imageId = )
    }

}
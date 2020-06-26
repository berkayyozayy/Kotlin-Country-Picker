package com.example.countrypickerkotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.countrypickerkotlin.model.Country

class CountryViewModel :  ViewModel() {

    val countryLiveData = MutableLiveData<Country>()

    fun getDataFromRoom() {
        val country = Country("Turkey","Ankara","Asia","TRY","WWW.SS.COM","Turkish")
        countryLiveData.value = country
    }
}
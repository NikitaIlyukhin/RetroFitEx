package com.example.retrofitex

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class ViewModel():androidx.lifecycle.ViewModel() {
    private var repo = Repository()
    val listCountry:MutableLiveData<Response<CountryModel>> = MutableLiveData()

    fun getCountry(){
//        CoroutineScope(Dispatchers.IO).launch {
//            listCountry.value = repo.getCountry()
//        }
        viewModelScope.launch {
            listCountry.value = repo.getCountry()
        }
    }
    fun getCountryWithError(){
//        CoroutineScope(Dispatchers.IO).launch {
//            listCountry.value = repo.getCountry()
//        }
        viewModelScope.launch {
            listCountry.value = repo.getCountryWithError()
        }
    }
}
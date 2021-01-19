package com.example.DaggerHiltDemo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    //This is to practice observers and livedata only
    // and not related to hilt or dependency Injection.
    fun dummyReturnData(): MutableLiveData<List<Int>> {
        val x = MutableLiveData<List<Int>>()
        var g = mutableListOf<Int>(23,45,245,234,5,2345,23,452,345,23,4523,45)
        try{
        g.add(5,3)
        }catch (e : Exception){
            Log.e("TAG", "fuck ho gaya: ", e)
        }
        x.value = g

        return x
    }
}
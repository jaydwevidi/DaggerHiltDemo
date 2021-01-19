package com.example.DaggerHiltDemo

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named

class MyOtherViewModel @ViewModelInject constructor(
    @Named("String2") testString22 : String
) :ViewModel()  {
    //Dagger Hilt Injection
    init {
        Log.d("TAG", ":My other ViewModel is called  $testString22 ")
        /*var sc = Scanner(System.`in`)
        sc.nextInt()*/
    }

}
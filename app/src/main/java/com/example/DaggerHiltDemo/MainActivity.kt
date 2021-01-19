package com.example.DaggerHiltDemo

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private var TAG = "MainActivity"

    @Inject
    @Named("String1")
    lateinit var testString1:String

    @Inject
    @Named("String2")
    lateinit var testString2:String

    @Inject
    @Named("StringFromMainModule")
    lateinit var mainString:String


    private val myOtherViewModel:MyOtherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myOtherViewModel


        val myViewModel:MyViewModel by viewModels()
        //import androidx.activity.viewModels
        //kotlinOptions { jvmTarget = JavaVersion.VERSION_1_8.toString() } in app/gradle

        myViewModel.dummyReturnData().observe(this, Observer<List<Int>> {
            Log.d(TAG, "onCreate: $it")
        })



        Log.d (TAG, "x\n" +
                "string 1 -> $testString1\n" +
                "string 2 -> $testString2\n" +
                "main String -> $mainString"
        )

    }
}
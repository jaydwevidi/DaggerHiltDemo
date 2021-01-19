package com.example.DaggerHiltDemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import dagger.internal.InjectedFieldSignature
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "x\n string 1 -> $testString1 \n string 2 -> $testString2")
    }
}
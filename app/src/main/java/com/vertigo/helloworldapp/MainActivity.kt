package com.vertigo.helloworldapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG_LOG, "Hello World")
    }


    companion object {
        private val TAG_LOG = MainActivity::class.java.simpleName
    }
}
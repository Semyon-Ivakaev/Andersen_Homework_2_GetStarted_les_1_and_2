package com.vertigo.homework_2_1_activities_and_intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class HelloActivity : AppCompatActivity() {
    private var countTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        countTextView = findViewById(R.id.hello_count)
        val intent = intent
        val count = intent.getStringExtra(MainActivityHomework.EXTRA_MESSAGE)
        Log.d(TAG_LOG, count.toString())
        
        countTextView?.text = count.toString()
    }

    companion object {
        private val TAG_LOG = HelloActivity::class.java.simpleName
    }
}
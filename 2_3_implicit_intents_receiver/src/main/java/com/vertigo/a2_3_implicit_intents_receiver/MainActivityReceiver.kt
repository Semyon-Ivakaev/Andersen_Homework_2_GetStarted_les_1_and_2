package com.vertigo.a2_3_implicit_intents_receiver

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivityReceiver : AppCompatActivity() {
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_receiver)

        textView = findViewById(R.id.text_uri_message)

        val intent = intent
        val uri = intent.data

        if (uri != null) {
            Log.d("AppVerbose", uri.toString())
            val uriString = "URI: $uri"
            textView?.text = uriString
        }
    }
}
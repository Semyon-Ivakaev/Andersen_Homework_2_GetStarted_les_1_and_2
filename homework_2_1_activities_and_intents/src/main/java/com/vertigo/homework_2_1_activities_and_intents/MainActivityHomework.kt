package com.vertigo.homework_2_1_activities_and_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivityHomework : AppCompatActivity() {
    private var mCount = 0
    private var countTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_homework)

        countTextView = findViewById(R.id.count_textView)
    }

    fun countUp(view: View) {
        mCount++
        countTextView?.text = mCount.toString()
    }
    fun sayHello(view: View) {
        Log.d(TAG_LOG, "SayHello Button clicked!")
        val intent = Intent(this, HelloActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE, mCount.toString())
        startActivity(intent)
    }

    companion object {
        private val TAG_LOG = MainActivityHomework::class.java.simpleName
        const val EXTRA_MESSAGE = "EXTRA_MESSAGE"
    }
}
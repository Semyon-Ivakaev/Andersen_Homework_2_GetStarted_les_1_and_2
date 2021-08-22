package com.vertigo.homework_2_2_activity_lifecycle_and_state

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivityHomework : AppCompatActivity() {
    private var mCount: Int = 0
    // Views
    private var countTextView: TextView? = null
    private var countButton: Button? = null
    private var editText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_homework)
        initViews()

        if (savedInstanceState != null) {
            val number = savedInstanceState.getInt("KEY")
            mCount = number
            countTextView?.text = mCount.toString()
        }

        countButton?.apply {
            setOnClickListener {
                mCount++
                countTextView?.text = mCount.toString()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("KEY", mCount)
    }

    private fun initViews() {
        countTextView = findViewById(R.id.count)
        countButton = findViewById(R.id.count_button)
        editText = findViewById(R.id.edit_text)
    }

}
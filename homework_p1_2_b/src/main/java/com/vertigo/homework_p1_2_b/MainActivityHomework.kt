package com.vertigo.homework_p1_2_b

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivityHomework : AppCompatActivity() {

    private var mCount = 0
    // Colors
    private var pinkColor: Drawable? = null
    private var greyColor: Drawable? = null
    private var greenColor: Drawable? = null
    private var blueColor: Drawable? = null

    // Views
    private var countTextView: TextView? = null
    private var zeroButton: Button? = null
    private var countButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_homework)
        initColors()
        initViews()
    }

    private fun initViews() {
        countTextView = findViewById(R.id.count_textView)
        zeroButton = findViewById(R.id.zero_button)
        countButton = findViewById(R.id.count_button)
    }

    private fun initColors() {
        pinkColor = ContextCompat.getDrawable(applicationContext, R.color.pink)
        greyColor = ContextCompat.getDrawable(applicationContext, R.color.grey)
        greenColor = ContextCompat.getDrawable(applicationContext, R.color.green)
        blueColor = ContextCompat.getDrawable(applicationContext, R.color.blue)
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }

    fun countUp(view: View) {
        mCount++
        countTextView?.text = mCount.toString()
        zeroButton?.background = pinkColor
        countButton?.background = greenColor
    }

    fun zeroClicked(view: View) {
        mCount = 0
        countTextView?.text = mCount.toString()
        zeroButton?.background = greyColor
        countButton?.background = blueColor
    }
}
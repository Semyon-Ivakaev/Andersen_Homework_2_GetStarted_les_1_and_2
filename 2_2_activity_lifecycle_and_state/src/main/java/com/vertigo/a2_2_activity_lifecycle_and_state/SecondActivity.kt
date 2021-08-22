package com.vertigo.a2_2_activity_lifecycle_and_state

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private var messageTextView: TextView? = null
    private var mReplyEditText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onCreate")

        messageTextView = findViewById(R.id.text_message)
        mReplyEditText = findViewById(R.id.editText_second)

        val intent = intent
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)

        messageTextView?.text = message
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onDestroy")
    }

    fun returnReply(view: View) {
        Log.d(LOG_TAG, "Reply Button clicked!")
        val replyMessage = mReplyEditText?.text.toString()
        val replyIntent = Intent()
        replyIntent.putExtra(EXTRA_REPLY, replyMessage)
        setResult(RESULT_OK, replyIntent)
        Log.d(LOG_TAG, "End SecondActivity")
        finish()
    }

    companion object {
        private val LOG_TAG = SecondActivity::class.java.simpleName
        const val EXTRA_REPLY = "REPLY"
    }
}
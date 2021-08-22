package com.vertigo.a2_1_activities_and_intents

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

        messageTextView = findViewById(R.id.text_message)
        mReplyEditText = findViewById(R.id.editText_second)

        val intent = intent
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)

        messageTextView?.text = message
    }

    fun returnReply(view: View) {
        Log.d(LOG_TAG, "Reply Button clicked!")
        val replyMessage = mReplyEditText?.text.toString()
        val replyIntent = Intent()
        replyIntent.putExtra(EXTRA_REPLY, replyMessage)
        setResult(RESULT_OK, replyIntent)
        finish()
    }

    companion object {
        private val LOG_TAG = SecondActivity::class.java.simpleName
        const val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"
    }
}
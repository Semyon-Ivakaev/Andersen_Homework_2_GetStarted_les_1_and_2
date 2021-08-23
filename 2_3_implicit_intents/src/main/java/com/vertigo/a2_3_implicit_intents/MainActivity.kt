package com.vertigo.a2_3_implicit_intents

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.core.app.ShareCompat

class MainActivity : AppCompatActivity() {
    private var mWebsiteEditText: EditText? = null
    private var mLocationEditText: EditText? = null
    private var mShareTextEditText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mWebsiteEditText = findViewById(R.id.web_editText)
        mShareTextEditText = findViewById(R.id.share_editText)
    }

    fun openWebsite(view: View) {
        val url = mWebsiteEditText?.text.toString()
        val webPage = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webPage)

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Log.d("MAIN", "${intent.resolveActivity(packageManager)}")
            Log.d("ImplicitIntents", "Can't handle this!")
        }
    }

    fun openLocation(view: View) {
        val loc = mLocationEditText?.text.toString()
        val addressUri = Uri.parse("geo:0,0?q=$loc")
        val intent = Intent(Intent.ACTION_VIEW, addressUri)

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    fun shareText(view: View) {
        val txt = mShareTextEditText?.text.toString()
        val mimeType = "text/plain"
        ShareCompat.IntentBuilder
            .from(this)
            .setType(mimeType)
            .setChooserTitle(getString(R.string.chooserTitle))
            .setText(txt)
            .startChooser();
    }

    /**
     * 2.3 Homework
     */
    fun takePicture(view: View) {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(intent)
    }
}
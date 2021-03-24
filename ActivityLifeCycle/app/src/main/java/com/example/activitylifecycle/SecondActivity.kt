package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle = intent.extras

        if (bundle!=null) {
            Log.d("test", "success")
        } else {
            Log.d("test", "fail")
        }

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.secondActivityTextView).apply {
            text = bundle?.getString("name")
        }
    }
}
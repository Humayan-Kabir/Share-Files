package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityBtn: Button
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityBtn = findViewById<Button>(R.id.nextActivityBtn);
        nextActivityBtn.setOnClickListener {

            val message = "new msg text"

            val intent = Intent(this, SecondActivity::class.java);

            intent.putExtra("profileName", "John Doe")

            var bundle = Bundle()
            bundle.putBoolean("isActive", true)
            bundle.putString("name", "secondActivity")
            intent.putExtras(bundle)
            startActivity(intent);

        }
    }
}
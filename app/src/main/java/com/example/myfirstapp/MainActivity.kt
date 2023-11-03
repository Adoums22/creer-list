package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    // Declaring the button as a class property
    private lateinit var btnStart: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button initialization using its ID
        val btnStart: Button = findViewById<Button>(R.id.btn_start)

        // Setting a click listener for the button
        btnStart.setOnClickListener {
            // Intent creation to access ListActivity
            val listActivityIntent = Intent(applicationContext, ListActivity::class.java)

            // Dstart ListActivity
            startActivity(listActivityIntent)

            // finish actual Activity
            finish()
        }

    }

}
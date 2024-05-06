package com.example.imadassignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start =findViewById<Button>(R.id.button)

        //this is the code we'll be using to have two diffrent pages
        //when the button is clicked it takes us to the next page
        start?.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)

            startActivity(intent)
    }
}}
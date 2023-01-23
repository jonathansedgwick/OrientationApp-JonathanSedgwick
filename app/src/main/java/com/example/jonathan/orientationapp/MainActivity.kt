package com.example.jonathan.orientationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var inputText: EditText
    lateinit var textButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputText = findViewById(R.id.input_text)
        textButton = findViewById(R.id.text_button)

        textButton.setOnClickListener {
            if (inputText.text.isEmpty())
                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(
                    this@MainActivity,
                    "Your name is ${inputText.text.toString()}",
                    Toast.LENGTH_SHORT
                ).show()
        }
    }
}
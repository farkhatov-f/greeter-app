package com.example.greeterapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.greet_button)
        val name: EditText = findViewById(R.id.input_dialog)
        button.setOnClickListener {
            if (name.text.toString().isBlank()) {
                Toast.makeText(this, "Please, enter your name.", Toast.LENGTH_SHORT).show()
            } else {
                val message: TextView = findViewById(R.id.greeting_text)
                val messageToDisplay = "Hello, ${name.text}"
                message.text = messageToDisplay
            }
        }
    }
}
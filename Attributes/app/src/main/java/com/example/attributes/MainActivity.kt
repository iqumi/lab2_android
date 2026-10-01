package com.example.attributes

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.edit_text)

        findViewById<Button>(R.id.button_black_text).setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }
        findViewById<Button>(R.id.button_red_text).setOnClickListener {
            editText.setTextColor(Color.RED)
        }
        findViewById<Button>(R.id.button_size_8).setOnClickListener {
            editText.textSize = 8f
        }
        findViewById<Button>(R.id.button_size_24).setOnClickListener {
            editText.textSize = 24f
        }
        findViewById<Button>(R.id.button_white_bg).setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }
        findViewById<Button>(R.id.button_yellow_bg).setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}

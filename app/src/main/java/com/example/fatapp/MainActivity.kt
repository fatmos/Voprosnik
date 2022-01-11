package com.example.fatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button.setOnClickListener {
            Toast.makeText(applicationContext,"CORRECT!",Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            Toast.makeText(applicationContext, "WRONGO!", Toast.LENGTH_SHORT).show()
        }

        button3.setOnClickListener {
            Toast.makeText(applicationContext, "WRONGO!", Toast.LENGTH_SHORT).show()
        }

    }







}
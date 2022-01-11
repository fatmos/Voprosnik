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
            showToast(1)
        }

        button2.setOnClickListener {
            showToast(2)

        }

        button3.setOnClickListener {
            showToast(3)

        }



        }
    fun showToast(answer : Int) {
        if ( answer == 1 ) {
            Toast.makeText(applicationContext, "Correctno", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(applicationContext,"Неправильно",Toast.LENGTH_SHORT).show()
        }
    }


}
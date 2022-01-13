package com.example.fatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var voprosNo = 0

    var vopros = listOf("What are the two official languages for Android development? \n\n A) Kotlin and Java \n\n B) Java and Python \n\n C) Kotlin and Python", "How do you define a function in Kotlin? \n\n A) void \n\n B) var \n\n C) function", "What is a variable used for? \n\n A) To contain data \n\n B) To insert a random value \n\n C) Don't know", "What does SDK stand for in Android SDK? \n\n A) Software Development Kit \n\n B) Software Development Kotlin \n\n C) Something Don't Know")

    var rightAnswers = listOf(1, 2, 1, 1)

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
        if ( answer == rightAnswers.get(voprosNo)) {
            Toast.makeText(applicationContext, "Correctno", Toast.LENGTH_SHORT).show()
            updateQuestion()
        }

        else {
            Toast.makeText(applicationContext,"Неправильно",Toast.LENGTH_SHORT).show()
        }
    }

    fun updateQuestion() {
        voprosNo += 1
        if (voprosNo >3) { //Зацикленные вопросы
            voprosNo =0
        }
        findViewById<TextView>(R.id.textView).setText(vopros.get(voprosNo))
    }








}
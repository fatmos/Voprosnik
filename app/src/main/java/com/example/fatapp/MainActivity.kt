package com.example.fatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var voprosNo = 0

    var vopros = listOf("Ты женат? \n\n A) Нет \n\n B) Да \n\n C) Есть партнёр", "Занимаешься спортом? \n\n A) Нет \n\n B) Да \n\n C) Раз в год", "Есть стресс? \n\n A)Нет \n\n B) Да \n\n C) Не замечал", "200 рсп или Ро? \n\n A) РО \n\n B) 200 РСП \n\n C) Чужих женщин не бывает")

    var rightAnswers = listOf(1, 2, 1, 1)

    //var text1 = findViewById<TextView>(R.id.textView)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






    }

    override fun onStart() {
        super.onStart()

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

    override fun onResume(){
        super.onResume()

    }
    override fun onPause(){
        super.onPause()

    }
    override fun onStop(){
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }



    fun showToast(answer: Int) {
        if (answer == rightAnswers.get(voprosNo)) {
            Toast.makeText(applicationContext, "Correctno", Toast.LENGTH_SHORT).show()
            updateQuestion()
        } else {
            Toast.makeText(applicationContext, "Неправильно", Toast.LENGTH_SHORT).show()
        }
    }


    fun updateQuestion() {
        voprosNo += 1
        if (voprosNo >3 ) {
            SecondActivity()
            voprosNo =0


        }
        /*else if (voprosNo >3){
            */
        else {

            findViewById<TextView>(R.id.textView).setText(vopros.get(voprosNo))
        }


    }
    private fun SecondActivity(){
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }
}
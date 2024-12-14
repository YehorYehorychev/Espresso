package com.gorter.myquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gorter.myquizapp.Constants.CORRECT_ANSWERS
import com.gorter.myquizapp.Constants.TOTAL_QUESTIONS
import com.gorter.myquizapp.Constants.USER_NAME

class ResultActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(USER_NAME)
        val totalQuestions = intent.getIntExtra(TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(CORRECT_ANSWERS,0)
        tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

}
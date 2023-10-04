package com.example.tms_an_15_homework_lesson_15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondOnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_on_boarding)
    }

    override fun onStop() {
        super.onStop()
        startActivity(Intent(this, ThirdOnBoardingActivity::class.java))
    }
}
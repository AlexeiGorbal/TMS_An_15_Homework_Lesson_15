package com.example.tms_an_15_homework_lesson_15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ThirdOnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_on_boarding)
    }

    override fun onStart() {
        super.onStart()
        startActivity(Intent(this, SplashActivity::class.java))
    }
}
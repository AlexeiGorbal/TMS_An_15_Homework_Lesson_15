package com.example.tms_an_15_homework_lesson_15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }

    override fun onStart() {
        super.onStart()
        startActivity(Intent(this, FirstOnBoardingActivity::class.java))
    }
}
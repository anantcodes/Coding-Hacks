package com.anant.codinghacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ForgotPasswordActivity : AppCompatActivity() {

    lateinit var btnOTP:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        btnOTP=findViewById(R.id.btnOTP)

        btnOTP.setOnClickListener {
            Toast.makeText(this,"OTP sent", Toast.LENGTH_SHORT).show()
        }

    }
}
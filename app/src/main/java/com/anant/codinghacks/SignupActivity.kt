package com.anant.codinghacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignupActivity : AppCompatActivity() {

    lateinit var txtLogin:TextView
    lateinit var btnSignUp:Button
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        txtLogin=findViewById(R.id.txtLogin)
        btnSignUp=findViewById(R.id.btnSignUp)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)


        txtLogin.setOnClickListener {
            intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }

        btnSignUp.setOnClickListener {
            if(etEmail.text.toString()=="anant4265@gmail.com"&&etPassword.text.toString()=="12345")
            {
                intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this,"Login  unsuccessful", Toast.LENGTH_SHORT).show()
            }
        }


    }
}
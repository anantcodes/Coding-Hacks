package com.anant.codinghacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {



    lateinit var etEmail:EditText
    lateinit var etPassword:EditText
    lateinit var btnLogin:Button
    lateinit var txtSignup:TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.button_login)
        txtSignup=findViewById(R.id.txtSignup)

    btnLogin.setOnClickListener{
        if(etEmail.text.toString()=="xyz@gmail.com"&&etPassword.text.toString()=="12345")
        {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
        else
        {
            Toast.makeText(this,"Login  unsuccessful", Toast.LENGTH_SHORT).show()
        }
    }

        txtSignup.setOnClickListener {
            intent = Intent(applicationContext, SignupActivity::class.java)
            startActivity(intent)
        }

    }
}

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
    lateinit var forgot_password:TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.button_login)
        txtSignup=findViewById(R.id.txtSignup)
        forgot_password=findViewById(R.id.forgot_password)

    btnLogin.setOnClickListener{
        if((etEmail.text.toString()=="anant4265@gmail.com"&&etPassword.text.toString()=="12345") || (etEmail.text.toString()=="ha9947@srmist.edu.in"&&etPassword.text.toString()=="sepm") || (etEmail.text.toString()=="am8123@srmist.edu.in"&&etPassword.text.toString()=="3441") )
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



        forgot_password.setOnClickListener {
            intent = Intent(applicationContext, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

    }
}

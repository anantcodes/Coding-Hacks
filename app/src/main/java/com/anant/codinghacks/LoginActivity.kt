package com.anant.codinghacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {



    lateinit var etEmail:EditText
    lateinit var etPassword:EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        if(etEmail.text.toString()=="xyz@gmail.com"&&etPassword.text.toString()=="12345")
        {
            Toast.makeText(this,"Login  successful", Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(this,"Login  unsuccessful", Toast.LENGTH_SHORT).show()
        }
    }
}

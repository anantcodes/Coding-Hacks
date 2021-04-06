package com.anant.codinghacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnDev:Button
    lateinit var btnPL:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDev=findViewById(R.id.btnDev)
        btnPL=findViewById(R.id.btnPL)

        btnDev.setOnClickListener{
            intent = Intent(applicationContext, DevelopmentActivity::class.java)
            startActivity(intent)
        }
        
        btnPL.setOnClickListener{
            intent = Intent(applicationContext, LanguageActivity::class.java)
            startActivity(intent)
        }





    }
}

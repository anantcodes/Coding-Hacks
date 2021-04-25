package com.anant.codinghacks

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DevelopmentActivity : AppCompatActivity() {



    lateinit var btnWeb: Button
    lateinit var btnMobile: Button
    lateinit var btnDS: Button
    lateinit var btnAPI: Button
    lateinit var btnSSD: Button
    lateinit var btnCC: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_development)

        btnWeb=findViewById(R.id.btnWeb)
        btnMobile=findViewById(R.id.btnMobile)
        btnDS=findViewById(R.id.btnDS)
        btnAPI=findViewById(R.id.btnAPI)
        btnSSD=findViewById(R.id.btnSSD)
        btnCC=findViewById(R.id.btnCC)

        btnWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/can-start-learn-web-development/")))
        }
        btnMobile.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/mobile_development_tutorials.htm")))
        }
    }
}
package com.anant.codinghacks

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LanguageActivity : AppCompatActivity() {

    lateinit var btnJava: Button
    lateinit var btnCPlus: Button
    lateinit var btnC: Button
    lateinit var btnPython: Button
    lateinit var btnKotlin: Button
    lateinit var btnJS: Button
    lateinit var btnGo: Button
    lateinit var btnCS: Button
    lateinit var btnHtml: Button
    lateinit var btnCSS: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        btnJava=findViewById(R.id.btnJava)
        btnCPlus=findViewById(R.id.btnCPlus)
        btnC=findViewById(R.id.btnC)
        btnPython=findViewById(R.id.btnPython)
        btnKotlin=findViewById(R.id.btnKotlin)
        btnJS=findViewById(R.id.btnJS)
        btnGo=findViewById(R.id.btnGo)
        btnCS=findViewById(R.id.btnCS)
        btnHtml=findViewById(R.id.btnHtml)
        btnCSS=findViewById(R.id.btnCSS)

        btnJava.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/java-tutorials/")))
        }
        btnCPlus.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/cpp-tutorial/")))
        }
        btnC.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/c-programming-language/")))
        }
        btnPython.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/python-tutorial/")))
        }
        btnKotlin.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/kotlin-programming-language/")))
        }
        btnJS.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/javascript-tutorial/")))
        }
        btnGo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/golang-tutorial-learn-go-programming-language/")))
        }

    }
}
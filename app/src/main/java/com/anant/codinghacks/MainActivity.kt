package com.anant.codinghacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnDev:Button
    lateinit var btnPL:Button
    lateinit var txtBeg:TextView
    lateinit var txtInt: TextView
    lateinit var txtExp:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDev=findViewById(R.id.btnDev)
        btnPL=findViewById(R.id.btnPL)
        txtBeg=findViewById(R.id.txtBeg)
        txtInt=findViewById(R.id.txtInt)
        txtExp=findViewById(R.id.txtExp)

        btnDev.setOnClickListener{
            intent = Intent(applicationContext, DevelopmentActivity::class.java)
            startActivity(intent)
        }
        
        btnPL.setOnClickListener{
            intent = Intent(applicationContext, LanguageActivity::class.java)
            startActivity(intent)
        }

        txtBeg.setOnClickListener {
            Toast.makeText(this,"Beginner",Toast.LENGTH_LONG).show()
        }
        txtInt.setOnClickListener {
            Toast.makeText(this,"Intermediate",Toast.LENGTH_SHORT).show()
        }
        txtExp.setOnClickListener {
            Toast.makeText(this,"Expert",Toast.LENGTH_SHORT).show()
        }


    }
}

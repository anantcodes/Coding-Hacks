package com.anant.codinghacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class QuestionsActivity : AppCompatActivity() {


    lateinit var Ans1:EditText
    lateinit var btnSubmit:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        Ans1=findViewById(R.id.Ans1)
        btnSubmit=findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            if(Ans1.text.toString()=="b")
            {
                Toast.makeText(this,"Pass", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this,"Fail", Toast.LENGTH_SHORT).show()
            }

        }



    }
}

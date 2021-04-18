package com.anant.codinghacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class QuestionsActivity : AppCompatActivity() {


    lateinit var Ans1:EditText
    lateinit var Ans2:EditText
    lateinit var Ans3:EditText
    lateinit var Ans4:EditText
    lateinit var Ans5:EditText
    lateinit var Ans6:EditText
    lateinit var Ans7:EditText
    lateinit var Ans8:EditText
    lateinit var Ans9:EditText
    lateinit var Ans10:EditText
    lateinit var btnSubmit:Button
    var c:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        Ans1=findViewById(R.id.Ans1)
        Ans2=findViewById(R.id.Ans2)
        Ans3=findViewById(R.id.Ans3)
        Ans4=findViewById(R.id.Ans4)
        Ans5=findViewById(R.id.Ans5)
        Ans6=findViewById(R.id.Ans6)
        Ans7=findViewById(R.id.Ans7)
        Ans8=findViewById(R.id.Ans8)
        Ans9=findViewById(R.id.Ans9)
        Ans10=findViewById(R.id.Ans10)
        btnSubmit=findViewById(R.id.btnSubmit)




    btnSubmit.setOnClickListener {

        if(Ans1.text.toString()=="b")
        {
            c++;
        }

        if(Ans2.text.toString()=="c")
        {
            c++;
        }

        if(Ans3.text.toString()=="b")
        {
            c++;
        }

        if(Ans4.text.toString()=="c")
        {
            c++;
        }

        if(Ans5.text.toString()=="d")
        {
            c++;
        }

        if(Ans6.text.toString()=="c")
        {
            c++;
        }

        if(Ans7.text.toString()=="c")
        {
            c++;
        }

        if(Ans8.text.toString()=="c")
        {
            c++;
        }

        if(Ans9.text.toString()=="c")
        {
            c++;
        }

        if(Ans10.text.toString()=="d")
        {
            c++;
        }

       // System.out.println("My name is Anant"+"c="+c)
        if (c >= 9) {
            Toast.makeText(this, "Expert", Toast.LENGTH_LONG).show()
        }

        if (c in 6..8) {

            Toast.makeText(this, "Intermediate", Toast.LENGTH_LONG).show()
        }
        if(c<=5)
        {

            Toast.makeText(this, "Beginner", Toast.LENGTH_LONG).show()
        }

    }


    }
}

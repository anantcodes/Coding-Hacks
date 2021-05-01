package com.anant.codinghacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class QueriesActivity : AppCompatActivity() {

    lateinit var btnQue:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_queries)

        btnQue=findViewById(R.id.btnQue)
        btnQue.setOnClickListener {
            Toast.makeText(this,"Query Submitted", Toast.LENGTH_SHORT).show()
        }
    }
}

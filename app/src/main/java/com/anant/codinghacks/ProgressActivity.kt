package com.anant.codinghacks

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class ProgressActivity : AppCompatActivity() {




    lateinit var progressBar:ProgressBar
    lateinit var btnReset:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)

// to implement Progress bar

        progressBar=findViewById(R.id.progressBar)
        btnReset=findViewById(R.id.btnReset)

        progressBar.max=1000
        val currentProgress=600
        ObjectAnimator.ofInt(progressBar,"progress",currentProgress)
                .setDuration(2000)
                .start()

        btnReset.setOnClickListener {
            progressBar.max=1000
            val cProgress=0
            ObjectAnimator.ofInt(progressBar,"progress",cProgress)
                    .setDuration(2000)
                    .start()
        }

    }
}

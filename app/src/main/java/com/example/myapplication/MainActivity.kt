package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lowE = findViewById<Button>(R.id.lowe)
        val mp = MediaPlayer.create(this, R.raw.lowe)
        lowE.setOnClickListener {
            mp.start()
        }
    }
}

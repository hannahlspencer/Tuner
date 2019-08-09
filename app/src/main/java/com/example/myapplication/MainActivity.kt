package com.example.myapplication

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.standardGuitar.StandardGuitar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        standard.setOnClickListener{
            startActivity(Intent(this, StandardGuitar::class.java))
        }
    }

    fun setMediaPlayers() {
//        val mpe = MediaPlayer.create(this, R.raw.lowe)
//        lowe.setOnClickListener {
//            mpe.start()
//        }
//        val mpa = MediaPlayer.create(this, R.raw.a)
//        a.setOnClickListener {
//            mpa.start()
//        }
//        val mpd = MediaPlayer.create(this, R.raw.lowe)
//        lowe.setOnClickListener {
//            mpd.start()
//        }
//        val mpg = MediaPlayer.create(this, R.raw.lowe)
//        lowe.setOnClickListener {
//            mpg.start()
//        }
    }
}

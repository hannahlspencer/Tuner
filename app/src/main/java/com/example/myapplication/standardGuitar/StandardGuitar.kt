package com.example.myapplication.standardGuitar

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.standard_guitar.*


class StandardGuitar: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standard_guitar)
        setMediaPlayers()
    }
    fun setMediaPlayers() {
        val mpe = MediaPlayer.create(this, R.raw.lowe)
        lowe.setOnClickListener {
            mpe.start()
        }
        val mpa = MediaPlayer.create(this, R.raw.a)
        a.setOnClickListener {
            mpa.start()
        }
//        val mpd = MediaPlayer.create(context, R.raw.lowe)
//        lowe.setOnClickListener {
//            mpd.start()
//        }
//        val mpg = MediaPlayer.create(context, R.raw.lowe)
//        lowe.setOnClickListener {
//            mpg.start()
//        }
    }
}


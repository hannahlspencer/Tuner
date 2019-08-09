package com.example.myapplication.tuningVariants

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
        lowe.setOnClickListener {
            playNote(R.raw.lowe)
        }
        a.setOnClickListener {
            playNote(R.raw.lowa)
        }
        d.setOnClickListener {
            playNote(R.raw.d)
        }
        g.setOnClickListener {
            playNote(R.raw.g)
        }
        b.setOnClickListener {
            playNote(R.raw.b)
        }
        e.setOnClickListener {
            playNote(R.raw.e)
        }
    }

    fun playNote(rawNote: Int) {
        val mp = MediaPlayer.create(this, rawNote)
        mp.start()
    }
}


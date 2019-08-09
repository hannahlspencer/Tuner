package com.example.myapplication.tuningVariants

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.open_d.*

class OpenD: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.open_d)
        setMediaPlayers()
    }

    fun setMediaPlayers() {
        opend_lowd.setOnClickListener {
            playNote(R.raw.lowd)
        }
        opend_a.setOnClickListener {
            playNote(R.raw.a)
        }
        opend_d.setOnClickListener {
            playNote(R.raw.d)
        }
        opend_fsharp.setOnClickListener {
            playNote(R.raw.fsharp)
        }
        opend_higha.setOnClickListener {
            playNote(R.raw.higha)
        }
        opend_highd.setOnClickListener {
            playNote(R.raw.highd)
        }
    }

    fun playNote(rawNote: Int) {
        val mp = MediaPlayer.create(this, rawNote)
        mp.start()
    }
}
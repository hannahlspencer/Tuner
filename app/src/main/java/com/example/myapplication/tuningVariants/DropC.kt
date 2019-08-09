package com.example.myapplication.tuningVariants

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.drop_c.*

class DropC:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drop_c)
        setMediaPlayers()
    }

    fun setMediaPlayers() {
        dropc_lowc.setOnClickListener {
            //TODO find a low C note
            playNote(R.raw.lowd)
        }
        dropc_g.setOnClickListener {
            playNote(R.raw.lowg)
        }
        dropc_c.setOnClickListener {
            playNote(R.raw.c)
        }
        dropc_f.setOnClickListener {
            playNote(R.raw.f)
        }
        dropc_a.setOnClickListener {
            playNote(R.raw.a)
        }
        dropc_d.setOnClickListener {
            playNote(R.raw.highd)
        }
    }

    fun playNote(rawNote: Int) {
        val mp = MediaPlayer.create(this, rawNote)
        mp.start()
    }
}
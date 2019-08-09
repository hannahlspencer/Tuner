package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.tuningVariants.DropC
import com.example.myapplication.tuningVariants.StandardGuitar
import com.example.myapplication.tuningVariants.OpenD

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setNavigation()
    }

    fun setNavigation() {
        standard.setOnClickListener{
            startActivity(Intent(this, StandardGuitar::class.java))
        }

        opend.setOnClickListener{
            startActivity(Intent(this, OpenD::class.java))
        }

        dropc.setOnClickListener{
            startActivity(Intent(this, DropC::class.java))
        }
    }
}

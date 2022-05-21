package com.calc.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PantsActivity : AppCompatActivity() {
    lateinit var btnPants:Button
    lateinit var btnPant:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pants2)
        btnPants=findViewById(R.id.btnPants)
        btnPants.setOnClickListener {
            val intent=Intent(this,shortsActivity::class.java)
            startActivity(intent)
        }
        btnPant=findViewById(R.id.btnPant)
        btnPant.setOnClickListener {
            val intent=Intent(this,PyjamasActivity::class.java)
            startActivity(intent)
        }
    }
}
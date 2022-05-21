package com.calc.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class shortsActivity : AppCompatActivity() {
    lateinit var btnNextt:Button
    lateinit var btnFirst:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shorts)
        btnNextt = findViewById(R.id.btnNextt)
        btnNextt.setOnClickListener {
            val intent=Intent(this,PantsActivity::class.java)
            startActivity(intent)
        }

        btnFirst = findViewById(R.id.btnFirst)
        btnFirst.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}
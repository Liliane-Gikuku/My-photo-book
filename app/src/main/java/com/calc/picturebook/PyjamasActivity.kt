package com.calc.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PyjamasActivity : AppCompatActivity() {
    lateinit var btnPyjamas:Button
    lateinit var btnPyjama:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pyjamas)
        btnPyjamas=findViewById(R.id.btnPyjamas)
        btnPyjamas.setOnClickListener {
            val intent= Intent(this,PantsActivity::class.java)
            startActivity(intent)
        }
        btnPyjama=findViewById(R.id.btnPyjama)
        btnPyjama.setOnClickListener {
            val intent=Intent(this,UniformsActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.calc.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UniformsActivity : AppCompatActivity() {
    lateinit var btnUniforms:Button
    lateinit var btnUniform:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uniforms)
        btnUniforms=findViewById(R.id.btnUniforms)
        btnUniforms.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}
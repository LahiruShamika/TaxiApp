package com.example.recovery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnNavigate = findViewById<Button>(R.id.button4)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, Order1::class.java)
            startActivity(intent)
        }
    }
}
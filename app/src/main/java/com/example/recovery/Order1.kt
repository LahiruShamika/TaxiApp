package com.example.recovery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Order1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order1)

        val btnNavigate = findViewById<Button>(R.id.button5)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, Order2::class.java)
            startActivity(intent)
        }
    }
}
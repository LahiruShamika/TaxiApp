package com.example.recovery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Order2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order2)

        val btnNavigate = findViewById<Button>(R.id.button6)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, Order3::class.java)
            startActivity(intent)
        }
    }
}
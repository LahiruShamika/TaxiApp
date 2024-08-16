package com.example.recovery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



            val btnNavigatef = findViewById<Button>(R.id.button3)
            btnNavigatef.setOnClickListener {
                val intent = Intent(this, Register::class.java)
                startActivity(intent)
            }
        val btnNavigatef1 = findViewById<Button>(R.id.button2)
        btnNavigatef1.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        }

}
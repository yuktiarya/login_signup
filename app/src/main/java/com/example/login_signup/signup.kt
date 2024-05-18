package com.example.login_signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        val signupButton2 = findViewById<TextView>(R.id.text2)
        val but=findViewById<AppCompatButton>(R.id.btn)

        signupButton2.setOnClickListener {
            val intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
        but.setOnClickListener {
            val intent= Intent(applicationContext,dashboard::class.java)
            startActivity(intent)
        }

            }
        }

package com.example.login_signup

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.EditText
import android.widget.TextView
import java.security.PrivateKey

class MainActivity : AppCompatActivity() {
    private lateinit var binding:MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val signupButton = findViewById<TextView>(R.id.text)
        signupButton.setOnClickListener {
            val intent = Intent(applicationContext,signup::class.java)
            startActivity(intent)
        }

    }
}
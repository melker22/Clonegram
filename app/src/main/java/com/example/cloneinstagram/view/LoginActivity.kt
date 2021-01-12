package com.example.cloneinstagram.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cloneinstagram.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        supportActionBar?.hide()
        window.navigationBarColor = getColor(R.color.colorPrimary)
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}
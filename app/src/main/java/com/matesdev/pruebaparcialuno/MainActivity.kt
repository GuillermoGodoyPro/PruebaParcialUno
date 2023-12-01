package com.matesdev.pruebaparcialuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent( this, ActivityNombre::class.java)
        intent.putExtra("nombre", "Gaudio")
        startActivity(intent)
    }
}
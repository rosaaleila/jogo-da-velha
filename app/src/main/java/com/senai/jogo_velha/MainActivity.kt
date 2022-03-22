package com.senai.jogo_velha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNovoJogo = findViewById<Button>(R.id.novo_jogo)
        val btnSair = findViewById<Button>(R.id.sair)

        btnNovoJogo.setOnClickListener() {
            val intent = Intent(this, ModoDeJogo::class.java)
            startActivity(intent)
        }

        btnSair.setOnClickListener() {
            finish()
        }


    }
}
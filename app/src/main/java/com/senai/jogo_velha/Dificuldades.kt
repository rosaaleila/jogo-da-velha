package com.senai.jogo_velha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Dificuldades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dificuldades)

        val btnFacil = findViewById<Button>(R.id.facil)
        val btnMedio = findViewById<Button>(R.id.medio)
        val btnDificil = findViewById<Button>(R.id.dificil)

        btnFacil.setOnClickListener() {
            val intent = Intent(this, jogoFacil::class.java)
            startActivity(intent)
        }

        btnMedio.setOnClickListener() {
            val intent = Intent(this, jogoMedio::class.java)
            startActivity(intent)
        }

        btnDificil.setOnClickListener() {
            val intent = Intent(this, jogoDificil::class.java)
            startActivity(intent)
        }

    }
}
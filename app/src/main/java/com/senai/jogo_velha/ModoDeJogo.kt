package com.senai.jogo_velha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ModoDeJogo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modo_de_jogo)

        val btn2Player = findViewById<Button>(R.id.player_vs_player)
        val btnPlayerPC = findViewById<Button>(R.id.player_vs_pc)

        btn2Player.setOnClickListener() {
            val intent = Intent(this, jogoPlayer::class.java)
            startActivity(intent)
        }

        btnPlayerPC.setOnClickListener() {
            val intent = Intent(this, Dificuldades::class.java)
            startActivity(intent)
        }

    }
}
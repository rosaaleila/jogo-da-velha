package com.senai.jogo_velha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView

private lateinit var botao1: Button
private lateinit var botao2: Button
private lateinit var botao3: Button
private lateinit var botao4: Button
private lateinit var botao5: Button
private lateinit var botao6: Button
private lateinit var botao7: Button
private lateinit var botao8: Button
private lateinit var botao9: Button
private lateinit var turnoTextView: TextView
private lateinit var containerLayouts: GridLayout

var turnoAtual = "Jogador 1"

class jogoFacil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo_facil)

        botao1 = findViewById(R.id.botao1)
        botao2 = findViewById(R.id.botao2)
        botao3 = findViewById(R.id.botao3)
        botao4 = findViewById(R.id.botao4)
        botao5 = findViewById(R.id.botao5)
        botao6 = findViewById(R.id.botao6)
        botao7 = findViewById(R.id.botao7)
        botao8 = findViewById(R.id.botao8)
        botao9 = findViewById(R.id.botao9)
        containerLayouts = findViewById(R.id.container_botoes)

        turnoTextView = findViewById(R.id.turno)


    }
}
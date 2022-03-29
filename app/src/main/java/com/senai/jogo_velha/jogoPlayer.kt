package com.senai.jogo_velha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout

private lateinit var botao1: Button
private lateinit var botao2: Button
private lateinit var botao3: Button
private lateinit var botao4: Button
private lateinit var botao5: Button
private lateinit var botao6: Button
private lateinit var botao7: Button
private lateinit var botao8: Button
private lateinit var botao9: Button

var jogadorAtual = ""
var fimDeJogo = false

class jogoPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo_player)

        botao1 = findViewById(R.id.botao1)
        botao2 = findViewById(R.id.botao2)
        botao3 = findViewById(R.id.botao3)
        botao4 = findViewById(R.id.botao4)
        botao5 = findViewById(R.id.botao5)
        botao6 = findViewById(R.id.botao6)
        botao7 = findViewById(R.id.botao7)
        botao8 = findViewById(R.id.botao8)
        botao9 = findViewById(R.id.botao9)

        val intent = Intent(this, Resultado::class.java)
        intent.putExtra("ganhador", jogadorAtual)

        iniciarJogo()
    }

    private fun iniciarJogo() {


    }

}

private fun calcularJogadas() {

    botao1.setOnClickListener() {
        if (jogadorAtual == "Jogador 1") {
            botao1.text = "X"
            jogadorAtual = "Jogador 2"
        } else {
            botao1.text = "O"
            jogadorAtual = "Jogador 1"
        }
    }

    botao2.setOnClickListener() {
        if (jogadorAtual.equals("Jogador 1")) {
            botao2.text = "X"
            jogadorAtual = "Jogador 2"

        } else {
            botao2.text = "O"
            jogadorAtual = "Jogador 1"
        }
    }

    botao3.setOnClickListener() {
        if (jogadorAtual.equals("Jogador 1")) {
            botao3.text = "X"
            jogadorAtual = "Jogador 2"
        } else {
            botao3.text = "O"
            jogadorAtual = "Jogador 1"
        }
    }

    botao4.setOnClickListener() {
        if (jogadorAtual.equals("Jogador 1")) {
            botao4.text = "X"
            jogadorAtual = "Jogador 2"
        } else {
            botao4.text = "O"
            jogadorAtual = "Jogador 1"
        }
    }

    botao5.setOnClickListener() {
        if (jogadorAtual.equals("Jogador 1")) {
            botao5.text = "X"
            jogadorAtual = "Jogador 2"
        } else {
            botao5.text = "O"
            jogadorAtual = "Jogador 1"
        }
    }

    botao6.setOnClickListener() {
        if (jogadorAtual.equals("Jogador 1")) {
            botao6.text = "X"
            jogadorAtual = "Jogador 2"
        } else {
            botao6.text = "O"
            jogadorAtual = "Jogador 1"
        }
    }

    botao7.setOnClickListener() {
        if (jogadorAtual.equals("Jogador 1")) {
            botao7.text = "X"
            jogadorAtual = "Jogador 2"
        } else {
            botao7.text = "O"
            jogadorAtual = "Jogador 1"
        }
    }

    botao8.setOnClickListener() {
        if (jogadorAtual.equals("Jogador 1")) {
            botao8.text = "X"
            jogadorAtual = "Jogador 2"
        } else {
            botao8.text = "O"
            jogadorAtual = "Jogador 1"
        }
    }


    botao9.setOnClickListener() {
        if (jogadorAtual.equals("Jogador 1")) {
            botao9.text = "X"
            jogadorAtual = "Jogador 2"
        } else {
            botao9.text = "O"
            jogadorAtual = "Jogador 1"
        }
    }

}

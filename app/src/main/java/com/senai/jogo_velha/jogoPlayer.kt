package com.senai.jogo_velha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

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

var jogadorAtual = "Jogador 1"
var fimDeJogo = false
var posicoesJogador1 = ArrayList<Int>()
var posicoesJogador2 = ArrayList<Int>()

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

        turnoTextView = findViewById<TextView>(R.id.turno)

        botao1.setOnClickListener() {
            if (jogadorAtual == "Jogador 1") {
                botao1.text = "X"
                jogadorAtual = "Jogador 2"
                botao1.isEnabled = false
                posicoesJogador1.add(1)

            } else {
                botao1.text = "O"
                jogadorAtual = "Jogador 1"
                botao1.isEnabled = false
                posicoesJogador2.add(1)
            }
        }

        botao2.setOnClickListener() {
            if (jogadorAtual == "Jogador 1") {
                botao2.text = "X"
                jogadorAtual = "Jogador 2"
                botao2.isEnabled = false
                posicoesJogador1.add(2)

            } else {
                botao2.text = "O"
                jogadorAtual = "Jogador 1"
                botao2.isEnabled = false
                posicoesJogador2.add(2)

            }
        }

        botao3.setOnClickListener() {
            if (jogadorAtual.equals("Jogador 1")) {
                botao3.text = "X"
                jogadorAtual = "Jogador 2"
                botao3.isEnabled = false
                posicoesJogador1.add(3)

            } else {
                botao3.text = "O"
                jogadorAtual = "Jogador 1"
                botao3.isEnabled = false
                posicoesJogador2.add(3)

            }
        }

        botao4.setOnClickListener() {
            if (jogadorAtual.equals("Jogador 1")) {
                botao4.text = "X"
                jogadorAtual = "Jogador 2"
                botao4.isEnabled = false
                posicoesJogador1.add(4)

            } else {
                botao4.text = "O"
                jogadorAtual = "Jogador 1"
                botao4.isEnabled = false
                posicoesJogador2.add(4)

            }
        }

        botao5.setOnClickListener() {
            if (jogadorAtual.equals("Jogador 1")) {
                botao5.text = "X"
                jogadorAtual = "Jogador 2"
                botao5.isEnabled = false
                posicoesJogador1.add(5)

            } else {
                botao5.text = "O"
                jogadorAtual = "Jogador 1"
                botao5.isEnabled = false
                posicoesJogador2.add(5)

            }
        }

        botao6.setOnClickListener() {
            if (jogadorAtual.equals("Jogador 1")) {
                botao6.text = "X"
                jogadorAtual = "Jogador 2"
                botao6.isEnabled = false
                posicoesJogador1.add(6)

            } else {
                botao6.text = "O"
                jogadorAtual = "Jogador 1"
                botao6.isEnabled = false
                posicoesJogador2.add(6)

            }
        }

        botao7.setOnClickListener() {
            if (jogadorAtual.equals("Jogador 1")) {
                botao7.text = "X"
                jogadorAtual = "Jogador 2"
                botao7.isEnabled = false
                posicoesJogador1.add(7)

            } else {
                botao7.text = "O"
                jogadorAtual = "Jogador 1"
                botao7.isEnabled = false
                posicoesJogador2.add(7)

            }
        }

        botao8.setOnClickListener() {
            if (jogadorAtual.equals("Jogador 1")) {
                botao8.text = "X"
                jogadorAtual = "Jogador 2"
                botao8.isEnabled = false
                posicoesJogador1.add(8)

            } else {
                botao8.text = "O"
                jogadorAtual = "Jogador 1"
                botao8.isEnabled = false
                posicoesJogador2.add(8)

            }
        }

        botao9.setOnClickListener() {
            if (jogadorAtual.equals("Jogador 1")) {
                botao9.text = "X"
                jogadorAtual = "Jogador 2"
                botao9.isEnabled = false
                posicoesJogador1.add(9)
            } else {
                botao9.text = "O"
                jogadorAtual = "Jogador 1"
                botao9.isEnabled = false
                posicoesJogador2.add(9)
            }
        }

        if (posicoesJogador1.size >= 3) {
            startActivity(intent)
        }


    }

}

package com.senai.jogo_velha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView
import kotlin.random.Random

private lateinit var botao01: Button
private lateinit var botao02: Button
private lateinit var botao03: Button
private lateinit var botao04: Button
private lateinit var botao05: Button
private lateinit var botao06: Button
private lateinit var botao07: Button
private lateinit var botao08: Button
private lateinit var botao09: Button
private lateinit var turno: TextView
var turnoAtual = "Jogador"

class jogoFacil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo_facil)

        botao01 = findViewById(R.id.botao1)
        botao02 = findViewById(R.id.botao2)
        botao03 = findViewById(R.id.botao3)
        botao04 = findViewById(R.id.botao4)
        botao05 = findViewById(R.id.botao5)
        botao06 = findViewById(R.id.botao6)
        botao07 = findViewById(R.id.botao7)
        botao08 = findViewById(R.id.botao8)
        botao09 = findViewById(R.id.botao9)
        turno = findViewById(R.id.turno)

        turno.text = "Vez do $turnoAtual"

        calcularJogadas()

    }

    private fun calcularJogadas() {

        botao01.setOnClickListener {
            if (turnoAtual == "Jogador") {
                jogadaPlayer(botao01)
            } else if (turnoAtual == "Computador") {
                jogadaComputador()
            }
        }

        botao02.setOnClickListener {
            if (turnoAtual == "Jogador") {
                jogadaPlayer(botao02)
            } else if (turnoAtual == "Computador") {
                jogadaComputador()
            }
        }

        botao03.setOnClickListener {
            if (turnoAtual == "Jogador") {
                jogadaPlayer(botao03)
                jogadaComputador()
            }
        }

        botao04.setOnClickListener {
            if (turnoAtual == "Jogador") {
                jogadaPlayer(botao04)
                jogadaComputador()
            }
        }

        botao05.setOnClickListener {
            if (turnoAtual == "Jogador") {
                jogadaPlayer(botao05)
                jogadaComputador()
            }
        }

        botao06.setOnClickListener {
            if (turnoAtual == "Jogador") {
                jogadaPlayer(botao06)
                jogadaComputador()
            }
        }

        botao07.setOnClickListener {
            if (turnoAtual == "Jogador") {
                jogadaPlayer(botao07)
                jogadaComputador()
            }
        }

        botao08.setOnClickListener {
            if (turnoAtual == "Jogador") {
                jogadaPlayer(botao08)
                jogadaComputador()
            }
        }

        botao09.setOnClickListener {
            if (turnoAtual == "Jogador") {
                jogadaPlayer(botao09)
                jogadaComputador()
            }
        }

    }


    private fun jogadaPlayer(botao: Button) {
        botao.text = "X"
        turnoAtual = "Computador"
        turno.text = "Vez de $turnoAtual"
        botao.isEnabled = false
    }

    private fun jogadaComputador() {

        val valor = Random.nextInt(1, 9)


    }

}
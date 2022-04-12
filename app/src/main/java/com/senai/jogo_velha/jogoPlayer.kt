package com.senai.jogo_velha

import android.content.Intent
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

var jogadorAtual: String = "Jogador 1"
var posicoesJogador1: MutableList<Button> = mutableListOf()
var posicoesJogador2: MutableList<Button> = mutableListOf()

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
        containerLayouts = findViewById(R.id.container_botoes)

        turnoTextView = findViewById(R.id.turno)

        calcularJogadas()

    }

    private fun calcularJogadas() {

        botao1.setOnClickListener {
            if (jogadorAtual == "Jogador 1") {
                jogadaPlayer1(botao1)
                posicoesJogador1.add(botao1)
            } else if (jogadorAtual == "Jogador 2") {
                jogadaPlayer2(botao1)
                posicoesJogador2.add(botao1)
            }
        }

        botao2.setOnClickListener {
            if (jogadorAtual == "Jogador 1") {
                jogadaPlayer1(botao2)
                posicoesJogador1.add(botao2)
            } else if (jogadorAtual == "Jogador 2") {
                jogadaPlayer2(botao2)
                posicoesJogador2.add(botao2)
            }
        }

        botao3.setOnClickListener {
            if (jogadorAtual == "Jogador 1") {
                jogadaPlayer1(botao3)

            } else if (jogadorAtual == "Jogador 2") {
                jogadaPlayer2(botao3)
            }

        }

        botao4.setOnClickListener {
            if (jogadorAtual == "Jogador 1") {
                jogadaPlayer1(botao4)

            } else if (jogadorAtual == "Jogador 2") {
                jogadaPlayer2(botao4)

            }

        }

        botao5.setOnClickListener {
            if (jogadorAtual == "Jogador 1") {
                jogadaPlayer1(botao5)

            } else if (jogadorAtual == "Jogador 2") {
                jogadaPlayer2(botao5)

            }

        }

        botao6.setOnClickListener {
            if (jogadorAtual == "Jogador 1") {
                jogadaPlayer1(botao6)
            } else if (jogadorAtual == "Jogador 2") {
                jogadaPlayer2(botao6)
            }
        }

        botao7.setOnClickListener {
            if (jogadorAtual == "Jogador 1") {
                jogadaPlayer1(botao7)

            } else if (jogadorAtual == "Jogador 2") {
                jogadaPlayer2(botao7)

            }

        }

        botao8.setOnClickListener {
            if (jogadorAtual == "Jogador 1") {
                jogadaPlayer1(botao8)

            } else if (jogadorAtual == "Jogador 2") {
                jogadaPlayer2(botao8)

            }
        }

        botao9.setOnClickListener {
            if (jogadorAtual == "Jogador 1") {
                jogadaPlayer1(botao9)
            } else if (jogadorAtual == "Jogador 2") {
                jogadaPlayer2(botao9)
            }

        }

    }

    private fun jogadaPlayer2(botao: Button) {
        botao.text = "O"
        jogadorAtual = "Jogador 1"
        botao.isEnabled = false
        verificarGanhador("O")
    }

    private fun jogadaPlayer1(botao: Button) {
        botao.text = "X"
        jogadorAtual = "Jogador 2"
        botao.isEnabled = false
        verificarGanhador("X")
    }

    private fun verificarGanhador(jogador: String) {

        val intent = Intent(this, Resultado::class.java)
        intent.putExtra("ganhador", jogador)

        if (botao1.text == jogador && botao2.text == jogador && botao3.text == jogador) {
            intent.putExtra("empate", "false")
            startActivity(intent)
        } else if (botao4.text == jogador && botao5.text == jogador && botao6.text == jogador) {
            intent.putExtra("empate", "false")
            startActivity(intent)
        } else if (botao7.text == jogador && botao8.text == jogador && botao9.text == jogador) {
            intent.putExtra("empate", "false")
            startActivity(intent)
        } else if (botao1.text == jogador && botao5.text == jogador && botao9.text == jogador) {
            intent.putExtra("empate", "false")
            startActivity(intent)
        } else if (botao3.text == jogador && botao5.text == jogador && botao7.text == jogador) {
            intent.putExtra("empate", "false")
            startActivity(intent)
        } else if (botao1.text == jogador && botao4.text == jogador && botao7.text == jogador) {
            intent.putExtra("empate", "false")
            startActivity(intent)
        } else if (botao2.text == jogador && botao5.text == jogador && botao8.text == jogador) {
            intent.putExtra("empate", "false")
            startActivity(intent)
        } else if (botao3.text == jogador && botao6.text == jogador && botao9.text == jogador) {
            intent.putExtra("empate", "false")
            startActivity(intent)
        } else if (!botao1.isEnabled && !botao2.isEnabled && !botao3.isEnabled && !botao4.isEnabled && !botao5.isEnabled && !botao6.isEnabled && !botao7.isEnabled && !botao8.isEnabled && !botao9.isEnabled) {
            intent.putExtra("empate", "true")
            startActivity(intent)
        }
    }

}

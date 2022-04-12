package com.senai.jogo_velha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val resultado = findViewById<TextView>(R.id.resultado)
        val novoJogo = findViewById<Button>(R.id.jogarNovamente)
        val sair = findViewById<Button>(R.id.sair)

        val intent: Intent = getIntent()

        val empate = intent.getStringExtra("empate")

        if(empate.equals("false")) {
            val ganhador = intent.getStringExtra("ganhador")
            resultado.text = "O vencedor foi ${ganhador}!"
        } else {
            resultado.text = "Houve um empate!"
        }

        novoJogo.setOnClickListener {
            val intent = Intent(this, ModoDeJogo::class.java)
            startActivity(intent)
        }

        sair.setOnClickListener {
            finish()
        }

    }
}
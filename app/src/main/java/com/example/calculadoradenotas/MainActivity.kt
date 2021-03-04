package com.example.calculadoradenotas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado  = resultado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val nota3 = Integer.parseInt(nota3.text.toString())
            val nota4 = Integer.parseInt(nota4.text.toString())
            val media = (nota1 + nota2 + nota3 + nota4)/4

            if(media <=6) {
                resultado.setText("Infelizmente o Aluno foi Reprovado" + "\n" + "Nota Final: " + media)
            }
            else {
                resultado.setText("O Aluno foi Aprovado" + "\n" + "Nota Final: " + media)
            }
        }
    }

    }
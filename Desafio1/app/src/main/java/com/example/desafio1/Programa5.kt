package com.example.desafio1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Programa5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programa5)

        val num1EditText = findViewById<EditText>(R.id.num1EditText)
        val num2EditText = findViewById<EditText>(R.id.num2EditText)
        val operadorEditText = findViewById<EditText>(R.id.operadorEditText)
        val calcularButton = findViewById<Button>(R.id.calcularButton)
        val resultadoTextView = findViewById<TextView>(R.id.resultadoTextView)
        val closeButton = findViewById<Button>(R.id.closeButton)

        calcularButton.setOnClickListener {
            val num1String = num1EditText.text.toString()
            val num2String = num2EditText.text.toString()
            val operador = operadorEditText.text.toString()

            if (num1String.isEmpty() || num2String.isEmpty() || operador.isEmpty()) {
                Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val num1 = num1String.toDouble()
            val num2 = num2String.toDouble()

            val resultado = calcularResultado(num1, num2, operador)

            resultadoTextView.text = "El resultado es: $resultado"
        }

+++
            }

    private fun calcularResultado(num1: Double, num2: Double, operador: String): Double {
        return when (operador) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 == 0.0) {
                    Toast.makeText(this, "No se puede dividir por cero", Toast.LENGTH_SHORT).show()
                    return 0.0
                } else {
                            num1 / num2
                        }
                    }
                    else -> {
                        Toast.makeText(this, "Operador no válido", Toast.LENGTH_SHORT).show()
                        return 0.0
                    }
                }
            }
}



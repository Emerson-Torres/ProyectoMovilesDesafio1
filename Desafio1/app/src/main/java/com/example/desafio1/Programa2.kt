package com.example.desafio1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Programa2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programa2)
        val nombreEditText= findViewById<EditText>(R.id.nombreEditText)
        val nota1EditText = findViewById<EditText>(R.id.nota1EditText)
        val nota2EditText = findViewById<EditText>(R.id.nota2EditText)
        val nota3EditText = findViewById<EditText>(R.id.nota3EditText)
        val nota4EditText = findViewById<EditText>(R.id.nota4EditText)
        val nota5EditText = findViewById<EditText>(R.id.nota5EditText)
        val calcularButton = findViewById<Button>(R.id.calcularButton)
        val resultadoTextView = findViewById<TextView>(R.id.resultadoTextView)

        calcularButton.setOnClickListener {
            val nombre = nombreEditText.text.toString()
            val nota1 = nota1EditText.text.toString().toDoubleOrNull()
            val nota2 = nota2EditText.text.toString().toDoubleOrNull()
            val nota3 = nota3EditText.text.toString().toDoubleOrNull()
            val nota4 = nota4EditText.text.toString().toDoubleOrNull()
            val nota5 = nota5EditText.text.toString().toDoubleOrNull()

            if (nombre.isEmpty() || nota1 == null || nota2 == null || nota3 == null || nota4 == null || nota5 == null) {
                Toast.makeText(
                    this,
                    "Por favor, complete todos los campos con valores válidos",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val promedio  = (nota1 + nota2 + nota3 + nota4 + nota5) / 5
            val resultado = if (promedio >= 6.0) "Aprobado" else "Reprobado"

            resultadoTextView.text = "El promedio de $nombre es: $promedio - $resultado"
        }
    }
}

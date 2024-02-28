package com.example.desafio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Programa3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programa3)


        val nombreEditText = findViewById<EditText>(R.id.nombreEditText)
        val salarioEditText = findViewById<EditText>(R.id.salarioEditText)
        val calcularButton = findViewById<Button>(R.id.calcularButton)
        val salarioNetoTextView = findViewById<TextView>(R.id.salarioNetoTextView)
        val closeButton = findViewById<Button>(R.id.closeButton)
        closeButton.setOnClickListener {
            finish()
        }
        calcularButton.setOnClickListener {
            val nombre = nombreEditText.text.toString()
            val salarioString = salarioEditText.text.toString()

            if (nombre.isEmpty() || salarioString.isEmpty()) {
                Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val salarioBase = salarioString.toDouble()

            val salarioNeto = calcularSalarioNeto(salarioBase)

            salarioNetoTextView.text = "El salario neto de $nombre es: $salarioNeto"
        }
    }
    private fun calcularSalarioNeto(salarioBase: Double): Double {
        val ISSS = salarioBase * 0.03
        val AFP = salarioBase * 0.04
        val RENTA = salarioBase * 0.05

        return salarioBase - (ISSS + AFP + RENTA)
    }
}
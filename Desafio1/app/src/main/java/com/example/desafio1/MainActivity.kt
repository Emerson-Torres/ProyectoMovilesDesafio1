package com.example.desafio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>?, selectedItemView: View?, position: Int, id: Long) {
                when (position) {
                    1 -> startActivity(Intent(this@MainActivity, Programa2::class.java))
                    2 -> startActivity(Intent(this@MainActivity, Programa3::class.java))
                    3 -> startActivity(Intent(this@MainActivity, Programa5::class.java))
                }
            }

            override fun onNothingSelected(parentView: AdapterView<*>?) {
                // No se hace nada si no se selecciona nada
            }
        }

    }
}
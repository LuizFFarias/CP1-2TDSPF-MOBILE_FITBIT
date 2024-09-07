package com.example.cp1_2tdspf_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class TelaVoce : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_voce)

        // Obtenha o BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)

        // Configurando o clique nos itens da BottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Voltar para MainActivity
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.voce -> {
                    // Já estamos na TelaVoce, não precisa fazer nada
                    true
                }
                R.id.integrantes -> {
                    // Ação para a tela de Integrantes (outra Activity)
                    true
                }
                else -> false
            }
        }
    }
}

package com.example.cp1_2tdspf_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Obtenha o BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)

        // Configurando o clique nos itens da BottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Ação para a Home
                    // Aqui você pode adicionar lógica adicional ou simplesmente ficar na MainActivity
                    true
                }
                R.id.voce -> {
                    // Intent para ir à TelaVoce
                    val intent = Intent(this, TelaVoce::class.java)
                    startActivity(intent)
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

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

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    true
                }
                R.id.voce -> {
                    val intent = Intent(this, TelaVoce::class.java)
                    startActivity(intent)
                    true
                }
                R.id.integrantes -> {
                    val intent = Intent(this, TelaIntegrantes::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}

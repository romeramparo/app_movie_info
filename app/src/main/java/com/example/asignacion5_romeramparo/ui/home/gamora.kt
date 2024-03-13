package com.example.asignacion5_romeramparo.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.asignacion5_romeramparo.R
import com.example.asignacion5_romeramparo.personajes_fragment

class gamora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gamora)

        val btn: Button = findViewById(R.id.back_gamora_btn)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, personajes_fragment::class.java)
            startActivity(intent)
        }

    }
}
package com.example.asignacion5_romeramparo.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.asignacion5_romeramparo.R
import com.example.asignacion5_romeramparo.personajes_fragment

class stardlord : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stardlord)

        val btn: Button = findViewById(R.id.back_star_btn)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, personajes_fragment::class.java)
            startActivity(intent)
        }
    }
}
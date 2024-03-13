package com.example.asignacion5_romeramparo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.asignacion5_romeramparo.ui.home.drax
import com.example.asignacion5_romeramparo.ui.home.gamora
import com.example.asignacion5_romeramparo.ui.home.groot
import com.example.asignacion5_romeramparo.ui.home.mantix
import com.example.asignacion5_romeramparo.ui.home.rocket
import com.example.asignacion5_romeramparo.ui.home.stardlord

class personajes_fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_personajes_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configura el clic del botón para abrir la nueva actividad
        view.findViewById<Button>(R.id.starlord_btn)?.setOnClickListener {
            startActivity(Intent(requireContext(), stardlord::class.java))
        }
        view.findViewById<Button>(R.id.rocket_btn)?.setOnClickListener {
            startActivity(Intent(requireContext(), rocket::class.java))
        }
        view.findViewById<Button>(R.id.drax_btn)?.setOnClickListener {
            startActivity(Intent(requireContext(), drax::class.java))
        }
        view.findViewById<Button>(R.id.groot_btn)?.setOnClickListener {
            startActivity(Intent(requireContext(), groot::class.java))
        }
        view.findViewById<Button>(R.id.gamora_btn)?.setOnClickListener {
            startActivity(Intent(requireContext(), gamora::class.java))
        }
        view.findViewById<Button>(R.id.mantix_btn)?.setOnClickListener {
            startActivity(Intent(requireContext(), mantix::class.java))
        }

    }
}

package com.example.asignacion5_romeramparo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.asignacion5_romeramparo.ui.home.momento1

import com.example.asignacion5_romeramparo.ui.home.momento2
import com.example.asignacion5_romeramparo.ui.home.momento3



class MomentosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_momentos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configura el clic del botón para abrir la nueva actividad
        view.findViewById<Button>(R.id.momento1_btn)?.setOnClickListener {
            startActivity(Intent(requireContext(), momento1::class.java))
        }
        view.findViewById<Button>(R.id.momento2_btn)?.setOnClickListener {
            startActivity(Intent(requireContext(), momento2::class.java))
        }
        view.findViewById<Button>(R.id.momento3_btn)?.setOnClickListener {
            startActivity(Intent(requireContext(), momento3::class.java))
        }

    }
}

package com.example.ws_mini

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class ListDeviceFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_list_device, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val btnSelecionar = view.findViewById<Button>(R.id.btnSelecionar)

        btnSelecionar.setOnClickListener {
            Toast.makeText(requireContext(), "Dispositivo selecionado", Toast.LENGTH_SHORT).show()
            parentFragmentManager.popBackStack() // volta para ConectarFragment
        }
    }
}
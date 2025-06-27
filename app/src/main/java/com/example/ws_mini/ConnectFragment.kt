package com.example.ws_mini

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class ConnectFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_connect, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val btnConectar = view.findViewById<Button>(R.id.btnConectar)
        val btnDesconectar = view.findViewById<Button>(R.id.btnDesconectar)

        btnConectar.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.main_fragment, ListDeviceFragment())
                .addToBackStack(null)
                .commit()
        }

        btnDesconectar.setOnClickListener {
            Toast.makeText(requireContext(), "Desconectado", Toast.LENGTH_SHORT).show()
        }
    }
}
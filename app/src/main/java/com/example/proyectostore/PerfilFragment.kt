package com.example.proyectostore

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.proyectostore.databinding.FragmentPerfilBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import org.json.JSONArray

class PerfilFragment : Fragment() {
    private lateinit var binding: FragmentPerfilBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPerfilBinding.inflate(inflater, container, false)
        val database = Firebase.database
        val myRef = database.reference
        val idus = "1"

        myRef.child("Usuarios").child(idus).child("nombre").get().addOnSuccessListener { response ->
            binding.textViewNombre.setText("¡Hola " + response.value.toString() + "!")
        }.addOnFailureListener{
            Log.e("firebaseResponse", "Error getting data", it)
        }

        myRef.child("Usuarios").child(idus).child("nombreUs").get().addOnSuccessListener { response ->
            binding.textViewUsuario.setText(response.value.toString())
        }.addOnFailureListener{
            Log.e("firebaseResponse", "Error getting data", it)
        }

        myRef.child("Usuarios").child(idus).child("nivel").get().addOnSuccessListener { response ->
            binding.textViewNivel.setText(response.value.toString())
        }.addOnFailureListener{
            Log.e("firebaseResponse", "Error getting data", it)
        }

        myRef.child("Usuarios").child(idus).child("nivelRes").get().addOnSuccessListener { response ->
            binding.textViewRestante.setText("Faltan " + response.value.toString() + " niveles")
        }.addOnFailureListener{
            Log.e("firebaseResponse", "Error getting data", it)
        }



        // Inflate the layout for this fragment
        return binding.root
    }

}
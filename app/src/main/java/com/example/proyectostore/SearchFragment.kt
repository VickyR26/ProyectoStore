package com.example.proyectostore

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.proyectostore.databinding.FragmentProductoBinding
import com.example.proyectostore.databinding.FragmentSearchBinding
import com.example.proyectostore.remote.ProductoEntry
import com.example.proyectostore.remote.RetrofitBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(inflater, container, false)


        val navController = findNavController()

        binding.buttonSearch.setOnClickListener{
            val id = binding.editTextBuscar.text.toString()

            navController.navigate(R.id.action_searchFragment_to_productoFragment)
        }


        return binding.root
    }


}
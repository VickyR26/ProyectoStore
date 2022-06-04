package com.example.proyectostore

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectostore.databinding.CardWishlistBinding
import org.json.JSONArray
import org.json.JSONObject

class MainAdapter (private val productos: JSONArray): RecyclerView.Adapter<MainAdapter.MainHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = CardWishlistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(productos[position] as JSONObject)
    }

    override fun getItemCount(): Int = productos.length()

    class MainHolder (val binding: CardWishlistBinding): RecyclerView.ViewHolder(binding.root){
        fun render (pokemon: JSONObject){
            binding.textViewNombre.setText(pokemon.getString("nombre"))

            //binding.textViewNombre.setText(pokemon.getString("nombre"))
        }
    }
}
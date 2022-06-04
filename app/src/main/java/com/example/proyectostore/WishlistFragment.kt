package com.example.proyectostore

import android.os.Bundle
import android.text.Editable
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.proyectostore.databinding.ActivityMainBinding
import com.example.proyectostore.databinding.FragmentWishlistBinding
import org.json.JSONObject

class WishlistFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_wishlist, container, false)
    }




}
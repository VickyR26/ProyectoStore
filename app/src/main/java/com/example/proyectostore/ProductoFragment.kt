package com.example.proyectostore

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.proyectostore.databinding.FragmentProductoBinding
import com.example.proyectostore.remote.ProductoEntry
import com.example.proyectostore.remote.RetrofitBuilder
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductoFragment : Fragment() {
    private lateinit var binding: FragmentProductoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductoBinding.inflate(inflater, container, false)
        val retrofit = RetrofitBuilder.create().getProductById("2")
        val navController = findNavController()

        binding.buttonVolver.setOnClickListener{
            navController.navigate(R.id.action_productoFragment_to_searchFragment)
        }

        retrofit.enqueue(object : Callback<ProductoEntry> {
            override fun onResponse(call: Call<ProductoEntry>, response: Response<ProductoEntry>) {
                val resBody = response.body()
                if (resBody != null) {
                    binding.textViewNombre.setText("${resBody.title}")
                    binding.textViewPrecio.setText("${resBody.price}")
                    binding.textViewDescripcion.setText("${resBody.description}")
                    binding.textViewCalificacion.setText("${resBody.raiting}")

                    val image = binding.imageViewProducto
                    Picasso.get().load(resBody.image.toString()).into(image)


                }
            }

            override fun onFailure(call: Call<ProductoEntry>, t: Throwable) {
                Log.e("retrofitresponse", "error: ${t.message}")
            }
        })

        return binding.root
    }


}
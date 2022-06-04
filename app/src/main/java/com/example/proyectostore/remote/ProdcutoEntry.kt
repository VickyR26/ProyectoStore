package com.example.proyectostore.remote

import com.google.gson.annotations.SerializedName


    data class ProductoEntry(
        @SerializedName("id")
        val id: Int,
        @SerializedName("title")
        val title: String,
        @SerializedName("price")
        val price: String,
        @SerializedName("description")
        val description: String,
        @SerializedName("category")
        val category: String,
        @SerializedName("image")
        val image: String,
        @SerializedName("raiting")
        val raiting: List<RatingEntry>
    )

    data class RatingEntry(
        @SerializedName("rate")
        val rate: Double,
        @SerializedName("count")
        val count: Int,
    )

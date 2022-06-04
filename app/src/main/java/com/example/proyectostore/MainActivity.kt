package com.example.proyectostore

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase




class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Firebase.database
        val myRef = database.reference

        //myRef.child("Usuarios").child("1").setValue(User("Victoria", "vicky", 15, 85))
        //myRef.child("Usuarios").child("2").setValue(User("Rocio", "chio", 22, 78))
        //myRef.child("Usuarios").child("3").setValue(User("Fernanda", "fer", 34, 66))


        val bottomNavView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        bottomNavView.setBackgroundColor(getColor(R.color.morado))
        bottomNavView.setItemIconTintList(ColorStateList.valueOf(getColor(R.color.white)))
        bottomNavView.setItemTextColor(ColorStateList.valueOf(getColor(R.color.white)))

        bottomNavView.setupWithNavController(navController)
    }
}
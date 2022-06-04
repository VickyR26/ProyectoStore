package com.example.proyectostore

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    fun saveUser(user: User) {
        viewModelScope.launch {

        }
    }

    fun deleteUser(user: User) {
        viewModelScope.launch {

        }
    }

    val savedUsers = MutableLiveData<List<User>>()
    fun getUsers(){
        viewModelScope.launch {

        }
    }
}
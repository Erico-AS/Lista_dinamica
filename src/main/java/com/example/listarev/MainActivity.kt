package com.example.listarev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView //inicializando o recycler view
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.Recycler) //atribuindo o recycler da tela para a variável
        recyclerView.adapter = adaptador() //declarando que o adaptador é a classe adaptador.kt
        recyclerView.layoutManager = LinearLayoutManager(this) //o manager é do próprio recycler
    }
}
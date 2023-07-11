package com.example.listarev

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class adaptador: RecyclerView.Adapter<Escudos>() { //o adaptador é a classe Escudos.kt
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Escudos {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cartao,parent,false) //define o que enxe o layout, ou seja, o que infla ele por dentro, no caso, os cards
        return Escudos(v) //chama a classe Escudos que tem a tela dentro e diz que vai ter os cartões dentro da tela
    }

    class escudosClube( //traz o escopo dos valores
        var fEscudos: Int, 
        var tEscudos: String,
        var dEscudos: String
    )

    var escudo: List<escudosClube> = listOf( //tipo lista com os valores do <escudosClube> pois é uma série de chamadas de definição 
        escudosClube(R.drawable.arsenal, "Arsenal", "Inglaterra"), //chama a classe e define cada variável
        escudosClube(R.drawable.barcelona, "Barcelona", "Catalunha"),
        escudosClube(R.drawable.chelsea,"Chelsea", "Inglaterra"),
        escudosClube(R.drawable.psg,"PSG","França"),
        escudosClube(R.drawable.manchester,"Manchester","Inglaterra"),
        escudosClube(R.drawable.realmadrid,"Madrid","Espanha")

    )

    override fun getItemCount(): Int {
        return escudo.size //retorna o tamanho da lista
    }

    override fun onBindViewHolder(holder: Escudos, position: Int) { //holder tem as mesmas variáveis que a classe Escudo
        holder.imagemEscudo.setImageResource(escudo[position].fEscudos) //seta a imagem devida na posição atual
        holder.tituloEscudo.text = escudo[position].tEscudos //seta o texto devido na posição atual
        holder.descricaoEscudo.text = escudo[position].dEscudos //seta o texto devido na posição atual
    }
}
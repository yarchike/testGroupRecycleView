package com.martynov.myapplication

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Adapter (val list : List<Pair<String, List<User>>>): RecyclerView.Adapter<Adapter.AdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_phone, parent, false)
        return  AdapterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        holder.bind(list[position].first, list[position].second)
    }

    override fun getItemCount(): Int = list.size

    inner class AdapterViewHolder(itemView: View):  RecyclerView.ViewHolder(itemView) {
        fun bind(depars : String, users: List<User>) {
            val textDepart = itemView.findViewById<TextView>(R.id.textDepart)
            val conteinerUser = itemView.findViewById<RecyclerView>(R.id.contanerUser)
            textDepart.text = depars
            conteinerUser.adapter = UserAdapter(users)
            val layoutManager = LinearLayoutManager(itemView.context, RecyclerView.VERTICAL, false)
            conteinerUser.layoutManager = layoutManager
        }
    }

}
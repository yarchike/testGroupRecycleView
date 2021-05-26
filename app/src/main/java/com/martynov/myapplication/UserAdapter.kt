package com.martynov.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter (val list : List<User>): RecyclerView.Adapter<UserAdapter.UserAdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapterViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_users, parent, false)
        return  UserAdapterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class UserAdapterViewHolder(itemView: View):  RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            val textName = itemView.findViewById<TextView>(R.id.textName)
            val textPhone = itemView.findViewById<TextView>(R.id.textPhone)
            textName.text = user.name
            textPhone.text = user.phone
        }
    }

}
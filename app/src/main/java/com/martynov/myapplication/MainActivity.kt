package com.martynov.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = Users.getUsers()
        Log.d("MyLog", "$list")
        Log.d("MyLog", "${list.groupBy { it.deportament }}")
        val listTwo = list.groupBy { it.deportament }
        val listFree = mutableListOf<Pair<String, List<User>>>()
        listTwo.forEach{ (dep, users) ->
            listFree.add(Pair(dep,users))
        }
        val containet  = findViewById<RecyclerView>(R.id.container)
        containet.adapter = Adapter(listFree)
        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        containet.layoutManager = layoutManager

    }
}
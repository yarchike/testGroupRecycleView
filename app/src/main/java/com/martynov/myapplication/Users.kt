package com.martynov.myapplication

object Users {
    fun getUsers(): List<User>{
        val list = mutableListOf<User>()
        list.add(User("Ярослав","8-987-987-99-91", "Программисты"))
        list.add(User("Игорь","8-999-987-99-91", "Администрация"))
        list.add(User("Святослав","8-111-987-99-91", "Администрация"))
        list.add(User("Екатерина","8-222-987-99-91", "Программисты"))
        list.add(User("Евгения","8-333-333-99-91", "Аналитики"))
        list.add(User("Тимур","8-444-987-99-91", "Аналитики"))
        list.sortBy { it.deportament }
        return list
    }
}
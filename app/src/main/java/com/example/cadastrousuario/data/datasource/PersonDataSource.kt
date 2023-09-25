package com.example.cadastrousuario.data.datasource

import android.content.Context

class PersonDataSource(context: Context) {
    private val personDao: PersonDao = AppDatabase.getInstance(context).personDao()

    suspend fun addPerson(person: Person){
        return personDao.addPerson(person)
    }
}
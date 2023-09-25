package com.example.cadastrousuario.data

import com.example.cadastrousuario.data.datasource.Person
import com.example.cadastrousuario.data.datasource.PersonDataSource

interface RegisterRepository {
    suspend fun addPerson(person: Person)
}


class RegisterRepositoryImpl(private val personDataSource: PersonDataSource) : RegisterRepository {
    override suspend fun addPerson(person: Person){
        personDataSource.addPerson(person)
    }

}
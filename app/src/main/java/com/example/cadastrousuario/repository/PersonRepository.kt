package com.example.cadastrousuario.repository

import androidx.lifecycle.MutableLiveData
import com.example.cadastrousuario.Person
import com.example.cadastrousuario.PersonDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PersonRepository(private val personDao: PersonDao) {
    val allPeople = MutableLiveData<List<Person>>()
    val foundPerson = MutableLiveData<Person>()
    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    fun addPerson(newPerson: Person){
        coroutineScope.launch(Dispatchers.IO){
            personDao.addPerson(newPerson)
        }
    }

    fun updatePersonDetails(newPerson: Person){
        coroutineScope.launch(Dispatchers.IO){
            personDao.updatePersonDetails(newPerson)
        }
    }

}
package com.example.cadastrousuario

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface PersonDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addPerson(person: Person)

    @Query("SELECT * FROM people WHERE personId = :perId")
    fun findPersonById(perId: String): Person

    @Query("SELECT * FROM people")
    fun getAllPeople(): List<Person>

    @Update
    suspend fun updatePersonDetails(person: Person)

    @Delete
    suspend fun deletePerson(person: Person)

}
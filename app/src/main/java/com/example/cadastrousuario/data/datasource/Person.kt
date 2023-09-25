package com.example.cadastrousuario.data.datasource

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Parcelize
@Entity(tableName = "people")
data class Person(
    @PrimaryKey(autoGenerate = false)
    @NonNull
    @ColumnInfo(name = "id")
    var id: Int,

    @ColumnInfo(name = "personId")
    var personId: Int,

    @ColumnInfo(name = "personName")
    var personName: String,

    @ColumnInfo(name = "personEmail")
    var personEmail: String,

    @ColumnInfo(name = "personPassword")
    var personPassword: String
)
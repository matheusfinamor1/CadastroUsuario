package com.example.cadastrousuario

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//@Parcelize
@Entity(tableName = "people")
data class Person(
    @PrimaryKey(autoGenerate = false)
    @NonNull
    @ColumnInfo(name = "id")
    var id: Int,

    @ColumnInfo(name = "personId")
    var personId: Long,

    @ColumnInfo(name = "personName")
    var personName: String,

    @ColumnInfo(name = "personEmail")
    var personEmail: String,

    @ColumnInfo(name = "personPassword")
    var personPassword: String
)

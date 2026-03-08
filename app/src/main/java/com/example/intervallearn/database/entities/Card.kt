package com.example.intervallearn.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.OffsetDateTime

@Entity
data class Card(
    @PrimaryKey val id: Int,

    val collection : String,
    val frontValue : String,
    val backValue : String,
    val lastStudied: OffsetDateTime?
)

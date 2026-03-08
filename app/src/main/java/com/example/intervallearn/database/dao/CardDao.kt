package com.example.intervallearn.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.intervallearn.database.entities.Card

@Dao
interface CardDao {
    @Insert()
    fun insertCard(card: Card)

    @Query("select * from Card")
    fun getAllCards() : List<Card>
}
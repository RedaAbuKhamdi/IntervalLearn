package com.example.intervallearn.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.intervallearn.database.dao.CardDao
import com.example.intervallearn.database.entities.Card

@Database(entities = [Card::class], version = 1)
abstract class AppDataBase : RoomDatabase(){
    companion object {
        private const val DATABASE_NAME = "IntervalLearn.db"

        @Volatile
        private var INSTANCE : AppDataBase? = null

        fun getInstance(context: Context) : AppDataBase {
            var instance = INSTANCE
            if (instance == null) {
                instance = Room.databaseBuilder(context.applicationContext, AppDataBase::class.java, DATABASE_NAME).build()
                INSTANCE = instance
            }
            return instance
        }
    }
    abstract fun cardDao(): CardDao
}
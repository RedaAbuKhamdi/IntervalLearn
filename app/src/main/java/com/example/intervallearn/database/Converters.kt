package com.example.intervallearn.database

import androidx.room.TypeConverter
import java.time.OffsetDateTime

class Converters {
    @TypeConverter
    fun fromStringToOffsetDateTime (value : String?) : OffsetDateTime? {
        return value?.let { OffsetDateTime.parse(value) }
    }
    @TypeConverter
    fun offsetDateTimeToString (value: OffsetDateTime?) : String? {
        return value?.toString()
    }
}
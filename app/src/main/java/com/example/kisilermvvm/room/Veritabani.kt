package com.example.kisilermvvm.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kisilermvvm.data.entity.Kisiler

@Database(entities = [Kisiler::class], version = 1)
abstract class Veritabani : RoomDatabase() {
abstract fun getKisilerDao() : KisilerDao
}
package com.lambdaschool.notetakerroom.modeldata

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NotesRoomDB : RoomDatabase() {
    abstract fun notesDao(): NotesRoomDao


}

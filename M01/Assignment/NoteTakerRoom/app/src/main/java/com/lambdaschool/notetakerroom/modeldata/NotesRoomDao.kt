package com.lambdaschool.notetakerroom

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.lambdaschool.notetaker.Note

@Dao
interface NotesRoomDao {

    @Insert
    fun createNote(note: Note): Long

    @Query("SELECT * FROM note")
    fun getNotes(): ArrayList<Note>

    //added room function

    @Delete
    fun deleteNote(note:Note):Long
    //I assume the lonh returned on createnote can be used similarly here, we'll figure that one out quick eventually

    @Query("SELECT * FROM note WHERE id = :id")
    fun readNoteByID(id:String)
    //should this be INT? String should be fine for now


}
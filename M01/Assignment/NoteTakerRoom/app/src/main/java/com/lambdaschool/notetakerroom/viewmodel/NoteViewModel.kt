package com.lambdaschool.notetaker

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import java.util.ArrayList

class NoteViewModel(application:Application) : AndroidViewModel(application) {
  //if you want context in a viewMode, this is how we do it
  val context:Context =application.applicationContext
    //changed to by lazt

    private val noteList: LiveData<ArrayList<Note>> by lazy {
        getNotesList()
    }
    private var repo: NoteRepository = NoteRepository(context)

    //signatures wrong
    fun getNotesList(): LiveData<ArrayList<Note>> {

        loadList()

        return repo.getNotes(context)
    }

    private fun loadList() {
        repo = NoteRepository(context)
        repo!!.getNotes(context)
    }

    fun addNote(note: Note) {
        //so add notes shouldn't need to mess with note list as we are using live data
        //I think -- for now we
        if (noteList != null) {
            repo.addNote(note)

        }
    }
}

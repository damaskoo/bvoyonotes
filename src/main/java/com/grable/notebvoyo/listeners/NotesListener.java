package com.grable.notebvoyo.listeners;

import com.grable.notebvoyo.model.Note;

public interface NotesListener {
    void  onNoteClicked(Note note, int position);

}

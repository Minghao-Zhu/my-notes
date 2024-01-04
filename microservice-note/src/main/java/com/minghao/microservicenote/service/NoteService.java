package com.minghao.microservicenote.service;

import com.minghao.microservicenote.model.Note;

import java.util.ArrayList;

public interface NoteService {

    ArrayList<Note> findNotesByAuthor(String authorId);

    Note findOneNoteByNoteId(String noteId);

    Object save(Note note);
}

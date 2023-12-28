package com.minghao.microservicenote.service;

import com.minghao.microservicenote.model.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NoteServiceImpl implements NoteService{

    @Override
    public ArrayList<Note> findNotesByAuthor(String authorId) {
        return null;
    }

    @Override
    public Note findOneNoteByNoteId(String noteId) {
        return null;
    }

    @Override
    public Object save(Note note) {
        return null;
    }
}

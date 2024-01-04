package com.minghao.microservicenote.service;

import com.minghao.microservicenote.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.MongoTemplate;
import java.util.ArrayList;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public ArrayList<Note> findNotesByAuthor(String authorId) {
        return null;
    }

    @Override
    public Note findOneNoteByNoteId(String noteId) {
        return null;
    }

    @Override
    public Note save(Note note) {
        return mongoTemplate.insert(note);
    }
}

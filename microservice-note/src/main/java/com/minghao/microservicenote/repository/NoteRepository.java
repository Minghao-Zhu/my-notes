package com.minghao.microservicenote.repository;

import com.minghao.microservicenote.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, String> {

}

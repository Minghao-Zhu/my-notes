package com.minghao.microservicenote.controller;

import com.minghao.microservicenote.model.Note;
import com.minghao.microservicenote.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class NoteController {
    @Autowired
    private NoteService noteService;


    /**
     * CORS headers string helper
     * @return CORS headers
     */
    private HttpHeaders getHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=UTF-8");
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE");
        return headers;
    }

    @CrossOrigin
    @PostMapping("/note")
    public ResponseEntity<?> addNote (@RequestBody Note note) {
        return new ResponseEntity<>(noteService.save(note), getHeader(), HttpStatus.CREATED);
    }
}

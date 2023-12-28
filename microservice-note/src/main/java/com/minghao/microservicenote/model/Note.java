package com.minghao.microservicenote.model;

import com.mongodb.internal.connection.Time;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "Note")
public class Note implements Serializable {

    @Id
    private String noteId;

    private String authorId;

    private String content;

    private Time createDate;

    private Time modifiedDate;



}

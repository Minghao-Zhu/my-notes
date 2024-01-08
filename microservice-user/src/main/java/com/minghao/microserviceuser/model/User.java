package com.minghao.microserviceuser.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "Note")
public class User implements Serializable {

    @Id
    private ObjectId _id;

    private String username;

    private String firstname;

    private String lastname;

    private String password;


}

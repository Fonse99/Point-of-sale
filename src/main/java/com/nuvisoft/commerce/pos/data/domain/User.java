package com.nuvisoft.commerce.pos.data.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String dni;
    private String password;

}

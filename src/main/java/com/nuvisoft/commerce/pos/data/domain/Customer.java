package com.nuvisoft.commerce.pos.data.domain;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Customer {

    @Id
    private String id;
    private String name;
    private String lastName;
    private String dni;
    private String phoneNumber;
    private Collection<Credit> credits;

}

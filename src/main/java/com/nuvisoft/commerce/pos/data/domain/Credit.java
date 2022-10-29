package com.nuvisoft.commerce.pos.data.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Credit {
    private String id;
    private Date dueDate;
    private Date authorizedDate;
    @DBRef
    private Invoice invoice;
    private double amount;
    private boolean isLate;
    @DBRef
    private Customer customer;
    @DBRef
    private User user;
}

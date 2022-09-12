package com.nuvisoft.commerce.pos.data.domain;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Product {

    @Id
    private String id;
    private String name;
    private String barcode;
    @DBRef
    private Collection<ProductDetail> details;
}

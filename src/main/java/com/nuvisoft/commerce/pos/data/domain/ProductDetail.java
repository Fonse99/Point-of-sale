package com.nuvisoft.commerce.pos.data.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class ProductDetail {

    private double price;
    private double cost;
    private double quantity;

}

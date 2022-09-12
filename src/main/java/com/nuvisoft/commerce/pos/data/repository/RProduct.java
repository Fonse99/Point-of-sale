package com.nuvisoft.commerce.pos.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nuvisoft.commerce.pos.data.domain.Product;

@Repository
public interface RProduct extends MongoRepository<Product, String> {
   
    public Product findByBarcode(String barcode);

    //TODO build a methods than retrieve all products by name coincidence
}

package com.nuvisoft.commerce.pos.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuvisoft.commerce.pos.controllers.stereotypes.ICrudResponsesController;
import com.nuvisoft.commerce.pos.data.domain.Product;
import com.nuvisoft.commerce.pos.services.ProductService;

@RestController
@CrossOrigin(origins = { "*" })
@RequestMapping("api/product")
public class ProductController implements ICrudResponsesController<Product> {

    @Autowired
    ProductService service;

    @Override
    public ResponseEntity<Product> create(Product element) {
        return new ResponseEntity<Product>(
                this.service.create(element),
                HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Collection<Product>> readAll() {
        return new ResponseEntity<Collection<Product>>(
                this.service.readAll(),
                HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Product> edit(Product element) {
        return new ResponseEntity<Product>(
                this.service.edit(element),
                HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Product> delete(Product element) {
        return new ResponseEntity<Product>(
                this.service.delete(element),
                HttpStatus.OK);
    }

    @GetMapping("/read/{barcode}")
    public ResponseEntity<Product> findByBarcode(@PathVariable String barcode) {

        return new ResponseEntity<Product>(
                this.service
                        .readProductByBarcode(barcode),
                HttpStatus.OK);
    }

}

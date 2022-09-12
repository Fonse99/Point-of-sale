package com.nuvisoft.commerce.pos.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuvisoft.commerce.pos.data.domain.Product;
import com.nuvisoft.commerce.pos.data.repository.RProduct;
import com.nuvisoft.commerce.pos.services.stereotypes.ICrudOperations;
import com.nuvisoft.commerce.pos.services.stereotypes.IMultipleOperations;

@Service
public class ProductService implements ICrudOperations<Product, String>, IMultipleOperations<Product, String> {

    @Autowired
    RProduct repository;

    @Override
    public Collection<Product> deleteAll(Collection<Product> elements) {
        this.repository.deleteAll(elements);

        return elements;
    }

    @Override
    public Collection<Product> addAll(Collection<Product> elements) {
        return this.repository.saveAll(elements);
    }

    @Override
    public Product create(Product element) {
        return this.repository.save(element);
    }

    @Override
    public Collection<Product> readAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Product> readById(String id) {
        return this.repository
                .findById(id)
                .or(null);
    }

    @Override
    public Product edit(Product element) {
        return this.repository.save(element);
    }

    @Override
    public Product delete(Product element) {
        this.repository.delete(element);
        return element;
    }

}

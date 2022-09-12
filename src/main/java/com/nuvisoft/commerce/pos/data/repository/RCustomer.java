package com.nuvisoft.commerce.pos.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nuvisoft.commerce.pos.data.domain.Customer;

@Repository
public interface RCustomer extends MongoRepository<Customer, String> {

    public Customer findByDni(String dni);

    public Customer findByName(String name);
}

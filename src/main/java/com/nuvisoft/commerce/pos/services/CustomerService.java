package com.nuvisoft.commerce.pos.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuvisoft.commerce.pos.data.domain.Customer;
import com.nuvisoft.commerce.pos.data.repository.RCustomer;
import com.nuvisoft.commerce.pos.services.stereotypes.ICrudOperations;
import com.nuvisoft.commerce.pos.services.stereotypes.IMultipleOperations;

@Service
public class CustomerService implements ICrudOperations<Customer, String>, IMultipleOperations<Customer, String> {

    @Autowired
    RCustomer repository;

    public Collection<Customer> readAll() {
        return this.repository.findAll();
    }

    @Override
    public Customer create(Customer element) {
        return this.repository.save(element);
    }

    @Override
    public Optional<Customer> readById(String id) {
        return this.repository
                .findById(id)
                .or(null);
    }

    @Override
    public Customer edit(Customer element) {
        return this.repository.save(element);
    }

    @Override
    public Customer delete(Customer element) {
        Customer deleted = element;

        this.repository.delete(element);

        return deleted;
    }

    @Override
    public Collection<Customer> deleteAll(Collection<Customer> elementsList) {

        this.repository.deleteAll(elementsList);

        return elementsList;
    }

    @Override
    public Collection<Customer> addAll(Collection<Customer> elements) {
        return this.repository.saveAll(elements);
    }
}

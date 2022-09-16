package com.nuvisoft.commerce.pos.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuvisoft.commerce.pos.data.domain.User;
import com.nuvisoft.commerce.pos.data.repository.RUser;
import com.nuvisoft.commerce.pos.services.stereotypes.ICrudOperations;

@Service
public class UserService implements ICrudOperations<User, String> {

    @Autowired
    RUser repository;

    @Override
    public User create(User element) {
        return this.repository.save(element);
    }

    @Override
    public Collection<User> readAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<User> readById(String id) {
        return this.repository
        .findById(id)
        .or(null);
    }

    @Override
    public User edit(User element) {
        return this.repository.save(element);
    }

    @Override
    public User delete(User element) {
         this.repository.delete(element);
         return element;
    }

}

package com.nuvisoft.commerce.pos.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nuvisoft.commerce.pos.data.domain.User;

@Repository
public interface RUser extends MongoRepository<User, String> {

    public User findByEmail(String email);

    public User findByDni(String dni);

}

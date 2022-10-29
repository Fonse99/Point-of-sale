package com.nuvisoft.commerce.pos.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuvisoft.commerce.pos.controllers.stereotypes.ICrudResponsesController;
import com.nuvisoft.commerce.pos.data.domain.User;
import com.nuvisoft.commerce.pos.services.UserService;

@RestController
@RequestMapping("api/user")
public class UserController implements ICrudResponsesController<User> {

    @Autowired UserService service;

    @Override
    public ResponseEntity<User> create(User element) {
        return new ResponseEntity<User>(
            this.service.create(element),
             HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Collection<User>> readAll() {
        return new ResponseEntity<Collection<User>>(
            this.service.readAll(), 
            HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> edit(User element) {
        return new ResponseEntity<User>(
            this.service.edit(element),
             HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<User> delete(User element) {
        return new ResponseEntity<User>(
            this.service.delete(element),
             HttpStatus.OK);
    }

}

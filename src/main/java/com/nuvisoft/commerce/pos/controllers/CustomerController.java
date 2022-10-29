package com.nuvisoft.commerce.pos.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuvisoft.commerce.pos.controllers.stereotypes.ICrudResponsesController;
import com.nuvisoft.commerce.pos.data.domain.Customer;
import com.nuvisoft.commerce.pos.services.CustomerService;

@RestController
@RequestMapping("api/customer")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController implements ICrudResponsesController<Customer> {

    @Autowired
    CustomerService service;

    // #region Crud Response interface Methods
    @Override
    public ResponseEntity<Customer> create(Customer element) {
        System.out.println(element.getName());

        return new ResponseEntity<Customer>(
                this.service.create(element),
                HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Collection<Customer>> readAll() {
        return new ResponseEntity<Collection<Customer>>(    
                this.service.readAll(),
                HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Customer> edit(Customer element) {
        return new ResponseEntity<Customer>(
                this.service.edit(element),
                HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Customer> delete(Customer element) {
        return new ResponseEntity<Customer>(
                this.service.delete(element),
                HttpStatus.OK);
    }
    // #endregion

    @DeleteMapping("/removeAll")
    public ResponseEntity<Collection<Customer>> deleteAll(@RequestBody Collection<Customer> customers) {
        return new ResponseEntity<Collection<Customer>>(
                this.service.deleteAll(customers),
                HttpStatus.OK);
    }
}

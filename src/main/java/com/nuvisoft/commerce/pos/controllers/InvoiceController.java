package com.nuvisoft.commerce.pos.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuvisoft.commerce.pos.controllers.stereotypes.ICrudResponsesController;
import com.nuvisoft.commerce.pos.data.domain.Invoice;
import com.nuvisoft.commerce.pos.services.InvoiceService;

@RestController
@RequestMapping("api/invoice")
@CrossOrigin(origins = { "*" })
public class InvoiceController implements ICrudResponsesController<Invoice> {

    @Autowired
    InvoiceService service;

    @Override
    public ResponseEntity<Invoice> create(Invoice element) {
        return new ResponseEntity<Invoice>(
                this.service.create(element),
                HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Collection<Invoice>> readAll() {
        return new ResponseEntity<Collection<Invoice>>(
                this.service.readAll(),
                HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Invoice> edit(Invoice element) {
        return new ResponseEntity<Invoice>(
                this.service.edit(element),
                HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Invoice> delete(Invoice element) {
        return new ResponseEntity<Invoice>(
                this.service.delete(element),
                HttpStatus.OK);

    }

}

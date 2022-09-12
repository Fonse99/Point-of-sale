package com.nuvisoft.commerce.pos.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuvisoft.commerce.pos.data.domain.Invoice;
import com.nuvisoft.commerce.pos.data.repository.RInvoice;
import com.nuvisoft.commerce.pos.services.stereotypes.ICrudOperations;

@Service
public class InvoiceService implements ICrudOperations<Invoice, String> {

    @Autowired
    RInvoice repository;

    @Override
    public Invoice create(Invoice element) {
        return this.repository.save(element);
    }

    @Override
    public Collection<Invoice> readAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Invoice> readById(String id) {
        return this.repository
                .findById(id)
                .or(null);
    }

    @Override
    public Invoice edit(Invoice element) {
        return this.repository.save(element);
    }

    @Override
    public Invoice delete(Invoice element) {
        Invoice deleted = element;

        this.repository.delete(element);
        return deleted;
    }

}

package com.nuvisoft.commerce.pos.data.repository;

import java.sql.Date;
import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nuvisoft.commerce.pos.data.domain.Invoice;

@Repository
public interface RInvoice extends MongoRepository<Invoice, String>{
   
    public Invoice findByInvoiceNumber(int invoiceNumber);
   
    public Collection<Invoice> findBySaleDate(Date saleDate);

}

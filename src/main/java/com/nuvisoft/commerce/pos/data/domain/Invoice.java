package com.nuvisoft.commerce.pos.data.domain;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Invoice {

    @Id
    private String id;
    private Date saleDate = new Date();
    private int invoiceNumber;
    // @DBRef
    private User seller;
    private double amount;
    private double discount;
    private double finalAmount;
    private Collection<InvoiceDetail> invoiceDetails;

}

package com.nuvisoft.commerce.pos.data.domain;

import lombok.Data;

@Data
public class InvoiceDetail {

    private double quantity;
    private double total;
    private ProductDetail detail;
}

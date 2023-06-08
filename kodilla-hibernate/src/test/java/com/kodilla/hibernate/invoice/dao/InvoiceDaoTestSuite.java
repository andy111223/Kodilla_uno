package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.math.BigDecimal;


@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");

        Item item1 = new Item(new BigDecimal("100"), 2);
        Item item2 = new Item(new BigDecimal("200"), 3);

        product1.setItem(item1);
        product2.setItem(item2);

        item1.getProducts().add(product1);
        item2.getProducts().add(product2);

        Invoice invoice = new Invoice("INV/2023/06");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assertions.assertNotEquals(0,id);

        //CleanUp
        try {
            invoiceDao.deleteById(id);
        } catch (Exception e) {
            //do nothing
        }
    }
}
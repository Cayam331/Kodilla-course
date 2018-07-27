package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSave(){

        //Given
        Item item1 = new Item(new BigDecimal(100), 10, new BigDecimal(20));
        Item item2 = new Item(new BigDecimal(110), 15, new BigDecimal(10));
        Item item3 = new Item(new BigDecimal(120), 20, new BigDecimal(40));
        Item item4 = new Item(new BigDecimal(130), 30, new BigDecimal(50));

        Product product1 = new Product("Banan");
        Product product2 = new Product("Salatka");

        product2.getItemsList().add(item1);
        product2.getItemsList().add(item2);
        product2.getItemsList().add(item3);
        product1.getItemsList().add(item1);

        Invoice invoice1 = new Invoice("005A");
        Invoice invoice2 = new Invoice("001B");

        invoice1.setItems(product1.getItemsList());
        invoice2.setItems(product2.getItemsList());

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();
        //Then
        Assert.assertNotEquals(0, invoice1Id);
        Assert.assertNotEquals(0, invoice2Id);


    }
}

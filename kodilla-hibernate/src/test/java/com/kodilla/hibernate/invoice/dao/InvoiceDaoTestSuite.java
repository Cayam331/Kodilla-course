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
import java.util.ArrayList;
import java.util.List;

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

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

        product1.setItemsList(itemList);
        product2.setItemsList(itemList);

        Invoice invoice1 = new Invoice("005A");
        Invoice invoice2 = new Invoice("001B");

        invoice1.setItems(itemList);
        invoice2.setItems(itemList);

        item1.setInvoice(invoice1);
        item1.setInvoice(invoice2);

        item2.setInvoice(invoice1);
        item2.setInvoice(invoice2);

        item3.setInvoice(invoice1);
        item3.setInvoice(invoice2);

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
package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    private int id;
    private String name;
    private List<Item> itemsList = new ArrayList<>();

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "itemsList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItemsList() {
        return itemsList;
    }

    private void setItemsList(List<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public Product(String name) {
        this.name = name;
    }
    public Product(){

    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}

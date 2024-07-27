package com.myworld.searchdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private long id;
    @Column(name="product_name")
    private String productName;
    @Column(name="price")
    private double price;

    @Column(name="image")
    private String image;



    public Product(){

    }
    public Product(String productName, double price, String image) {
        this.productName = productName;
        this.price = price;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {this.image = image;}

}

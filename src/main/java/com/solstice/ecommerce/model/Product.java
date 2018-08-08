package com.solstice.ecommerce.model;

public class Product {

    private String productName;
    private String productDescription;
    private byte[] image;
    private double price;

    public Product() {
    }

    public Product(String productName, String productDescription, byte[] image, double price) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.image = image;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

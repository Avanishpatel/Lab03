package com.solstice.ecommerce.model;

public class OrderLineItems {

    private Product product;
    private long quantity;
    private double price;
    private double totalPrice;
    private Shipment shipment;

    public OrderLineItems() {
    }

    public OrderLineItems(Product product, long quantity, double price, double totalPrice, Shipment shipment) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
        this.shipment = shipment;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
}

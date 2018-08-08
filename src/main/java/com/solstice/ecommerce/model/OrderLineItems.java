package com.solstice.ecommerce.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class OrderLineItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderLineId")
    private long orderLineId;

    @OneToOne
    @JoinColumn(name = "orederLineId", referencedColumnName = "productId")
    private Product product;
    private long quantity;
    private double price;
    private double totalPrice;
    @OneToOne
    @JoinColumn(name = "orderLineId", referencedColumnName = "shipmentId")
    private Shipment shipment;

    public OrderLineItems() {
    }

    public long getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(long orderLineId) {
        this.orderLineId = orderLineId;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
}

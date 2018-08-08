package com.solstice.ecommerce.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shipmentId")
    private long shipmentId;
    @OneToOne
    @JoinColumn(name = "shipmentId", referencedColumnName = "accountId")
    private Account account;
    @OneToOne()
    @JoinColumn(name = "shipmentId", referencedColumnName = "addressId")
    private Address address;
    @OneToOne
    @JoinColumn(name = "shipmentId", referencedColumnName = "orderLineId")
    private  OrderLineItems items;
    private Date shippingDate;
    private Date deliveryDate;

    public Shipment() {
    }

    public long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public OrderLineItems getItems() {
        return items;
    }

    public void setItems(OrderLineItems items) {
        this.items = items;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}

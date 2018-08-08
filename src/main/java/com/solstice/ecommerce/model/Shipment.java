package com.solstice.ecommerce.model;

import java.util.Date;

public class Shipment {

    private Account account;
    private Address address;
    private  OrderLineItems items;
    private Date shippingDate;
    private Date deliveryDate;

    public Shipment() {
    }

    public Shipment(Account account, Address address, OrderLineItems items, Date shippingDate, Date deliveryDate) {
        this.account = account;
        this.address = address;
        this.items = items;
        this.shippingDate = shippingDate;
        this.deliveryDate = deliveryDate;
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

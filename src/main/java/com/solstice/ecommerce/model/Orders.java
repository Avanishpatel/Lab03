package com.solstice.ecommerce.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Orders {

    private long orderNumber;
    private Account account;
    private Date orderDate;
    private Address shippingAddress;
    private OrderLineItems orderLineItems;
    private double totalPrice;

    public Orders() {
    }

    public Orders(long orderNumber, Account account, Date orderDate, Address shippingAddress, OrderLineItems orderLineItems, double totalPrice) {
        this.orderNumber = orderNumber;
        this.account = account;
        this.orderDate = orderDate;
        this.shippingAddress = shippingAddress;
        this.orderLineItems = orderLineItems;
        this.totalPrice = totalPrice;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public OrderLineItems getOrderLineItems() {
        return orderLineItems;
    }

    public void setOrderLineItems(OrderLineItems orderLineItems) {
        this.orderLineItems = orderLineItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

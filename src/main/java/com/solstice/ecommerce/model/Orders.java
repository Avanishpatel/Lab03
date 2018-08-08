package com.solstice.ecommerce.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderId")
    private long orderNumber;

    @OneToOne
    @JoinColumn(name ="orderId", referencedColumnName = "accountId")
    private Account account;
    private Date orderDate;
    @OneToOne
    @JoinColumn(name ="orderId", referencedColumnName = "addressId")
    private Address shippingAddress;
    @OneToOne
    @JoinColumn(name = "orderId", referencedColumnName = "orderLineId")
    private OrderLineItems orderLineItems;
    private double totalPrice;

    public Orders() {
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

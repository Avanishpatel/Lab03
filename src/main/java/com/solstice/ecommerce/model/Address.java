package com.solstice.ecommerce.model;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="addressId")
    private long id;
    private String street;
    private String aptOrBuilding;
    private String city;
    private String state;
    private int zipCode;
    private String country;
    @Column(name = "accountId")
    private long accountId;

    public Address() {
    }

    public Address(long id,String street, String aptOrBuilding, String city, String state, int zipCode, String country) {

        this.id = id;
        this.street = street;
        this.aptOrBuilding = aptOrBuilding;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAptOrBuilding() {
        return aptOrBuilding;
    }

    public void setAptOrBuilding(String aptOrBuilding) {
        this.aptOrBuilding = aptOrBuilding;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

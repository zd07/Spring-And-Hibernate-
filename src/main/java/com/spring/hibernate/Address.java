/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import java.util.Date;
import javax.annotation.processing.Generated;

/**
 *
 * @author safda
 */
@Entity(name ="student_address")
public class Address {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="address_id")
    private int addressId;
    @Column(length = 50)
    private String street;
    @Column(length = 100)
    private String city;
    @Column(name = "is_open")
    private boolean  isOpen;
    @Transient
    private int x;
    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)
    private Date addDate;
    @Lob
    @Column(name = "image", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] image;

    public Address() {
        super();
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStree(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isIsOpen() {
        return isOpen;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    
}

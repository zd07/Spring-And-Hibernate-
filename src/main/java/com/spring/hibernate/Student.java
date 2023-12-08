/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author safda
 */
//@Tansient to not save this field in data base
//@Tempora over a date fields to farmat date
@Entity  // use to mark any class as Entity
//@Lob large object
//@Table-use to change the details of the table
public class Student {
    @Id//to make column primary key
    //@GeneratedValue automatically generate values for that using an internal sequence
    private int id;
    //@column can be used to specify column mapping for example to change column name
    private String name;
    private String city;
    private Certificate certi;

    public int getId() {
        return id;
    }

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Student() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Certificate getCerti() {
        return certi;
    }

    public void setCerti(Certificate certi) {
        this.certi = certi;
    }
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", city=" + city + '}';
    }

}

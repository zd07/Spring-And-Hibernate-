/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.spring.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author safda
 */
public class Hibernate {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory);
        Student student = new Student(12,"Zahid","Hyderabad");
        
        Address ad = new Address();
        ad.setStree("strret1");
        ad.setCity("Patna");
        ad.setIsOpen(true);
        ad.setAddDate(new Date());
        ad.setX(456);
        FileInputStream f = new FileInputStream("src/main/java/professor.png");
        byte[] data = new byte[f.available()];
        f.read(data);
        ad.setImage(data);
       




        Session session= factory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(student);
        session.save(ad);
        tx.commit();
        session.close(); ;
        
        
    }
}

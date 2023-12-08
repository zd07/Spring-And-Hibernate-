/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author safda
 */
public class Emdemo {
    public static void main(String[] args) {
         Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Student st=new Student();
        st.setId(8);
        st.setName("Danish");
        st.setCity("Hyderabad");
        st.setCerti(new Certificate("Abdroid","2 months"));
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        s.save(st);
        tx.commit();
        s.close();
        factory.close();
    }
}

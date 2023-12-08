/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.map1;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author safda
 */
public class MappingDemo {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Emp e1=new Emp();
        Emp e2=new Emp();
        e1.setEid(41);
        e1.setName("Danish");
        e2.setEid(20);
        e2.setName("Aman");
        Project p1=new Project();
        Project p2=new Project();
        p1.setPid(123);
        p1.setProjectName("Library Management");
        p2.setPid(124);
        p2.setProjectName("CMS");
        List<Emp> list1=new ArrayList<>();
        List<Project> list2=new ArrayList<>();
        list1.add(e1);
        list1.add(e2);
        list2.add(p1);
        list2.add(p2);
        e1.setProjects(list2);
        p2.setEmployes(list1);
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);
        tx.commit();
        session.close();
        factory.close();
        
    }
}

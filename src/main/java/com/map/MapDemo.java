/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.map;

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
public class MapDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
//        Question q1=new Question();
//        q1.setQuestionId(1212);
//        q1.setQuestion("What is java ?");
//        Answer ans= new Answer();
//        ans.setAnswerId(343);
//        ans.setAnswer("Java is programming Language");
//        ans.setQuestion(q1);
//        
//
//        Answer ans1= new Answer();
//        ans1.setAnswerId(33);
//        ans1.setAnswer("With the help of java we can create softwares");
//        ans1.setQuestion(q1);
//
//        List<Answer> list=new ArrayList<>();
//        list.add(ans);
//        list.add(ans1);
//        q1.setAnswers(list);
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
//        session.save(q1);
//        session.save(ans);
//        session.save(ans1);
        Question q = (Question) session.get(Question.class, 1212);
        System.out.println(q.getQuestionId());
        System.out.println(q.getQuestion());
        //Lazy loading
//        System.out.println();
        
        
        
        tx.commit();
        session.close();
        factory.close();
    }
}

package com.c3.annotation.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
 
public class TestInheritance {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();


        SessionFactory sessionFactory = (SessionFactory) meta.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();   

        Project ecommerce = new Project();
        ecommerce.setProjectName("Mac");

        Module m = new Module();
        m.setProjectName("Apple");
        m.setModuleName("log");

        Task task = new Task();
        task.setTaskName("Loop");
        task.setModuleName("ArrayList");
        task.setProjectName("Collection");


        session.save(ecommerce);
        session.save(m);
        session.save(task);
        t.commit();
        session.close();
        sessionFactory.close();
    }
 
}
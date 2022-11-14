package com.c1.twotables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
 
public class TestCustomer {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
 
Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//Resource intensive
SessionFactory sessionFactory = (SessionFactory)meta.getSessionFactoryBuilder().build();
 
Session session = sessionFactory.openSession();
 
Transaction transaction = session.beginTransaction();
Customer varsha = new Customer();
varsha.setCustomerName("Varsha M");
varsha.setCustomerAddress("1/4, PJ street");
varsha.setCreditScore(500);
varsha.setRewardPoints(1000);

session.save(varsha);

transaction.commit();
session.close();
sessionFactory.close();
 
 
    }
 
}
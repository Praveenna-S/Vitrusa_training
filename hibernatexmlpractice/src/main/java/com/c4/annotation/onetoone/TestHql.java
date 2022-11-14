package com.c4.annotation.onetoone;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
 
public class TestHql {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
 
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
 
        // Select a person
        Query query = session.createQuery("from Person");
        List<Person> personList = query.list();
        for (Person person : personList) {
            System.out.println("List of persons: " + person.getPersonId() + " &" + person.getPersonName());
        }
 
        // Select a person with Id
        query = session.createQuery("from Person where personId=:id");
        query.setInteger("id", 21);
 
        Person person = (Person) query.uniqueResult();
 
        System.out.println("List of persons: " + person.getPersonId() + " &" + person.getPersonName());
 
        session.close();
        
      //update Person       
        query = session.createQuery("update Person set name= :name where personid= :id");
        query.setParameter("name", "Shwetha");
        query.setInteger("id", 21);
        int result = query.executeUpdate();
        System.out.println("Person Update Status="+result);
        
      //Aggregate function examples
        query = session.createQuery("select sum(rewardPoints) from Customer");
        Long sumRewardPoints =  (Long) query.uniqueResult();
        System.out.println("Sum of all Salaries= "+sumRewardPoints);
 
        //join examples
        query = session.createQuery("select person.personName, pdtl.zipCode from Person person "
                + "INNER JOIN person.personDetail pdtl");
        List<Object[]> list = query.list();
        for(Object[] arr : list){
            System.out.println(Arrays.toString(arr));
        }
    }
 
}
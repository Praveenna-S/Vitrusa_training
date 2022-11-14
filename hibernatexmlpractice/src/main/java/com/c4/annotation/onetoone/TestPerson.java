package com.c4.annotation.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class TestPerson {
 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
 
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        {
        PersonDetail pd = new PersonDetail();
        pd.setZipCode(123);
        pd.setJob("Accountant");
        Person thanvi = new Person();
        thanvi.setPersonName("Thanvi");
        thanvi.setPersonDetail(pd);
        session.save(thanvi);
        }{
        PersonDetail pd1 = new PersonDetail();
        pd1.setZipCode(123);
        pd1.setJob("Engineer");
        Person manisha = new Person();
        manisha.setPersonName("Manisha");
        manisha.setPersonDetail(pd1);
        session.save(manisha);

        }{
        PersonDetail pd2 = new PersonDetail();
        pd2.setZipCode(123);
        pd2.setJob("VP");
        Person ankita = new Person();
        ankita.setPersonName("Ankita");
        ankita.setPersonDetail(pd2);
        session.save(ankita);


        }




        t.commit();
        session.close();
 
    }
 
}
package com.c2.embed;

import java.util.Iterator;
import java.util.List;
 
import javax.persistence.TypedQuery;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
 
public class TestEmbed {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();


        SessionFactory sessionFactory = (SessionFactory) meta.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction(); 
        SchoolDetail sd= new SchoolDetail();
        sd.setPublicSchool(true);
        sd.setSchoolAddress("4, APJ street");
        sd.setStudentCount(500);
 
        School vikasini = new School();
        vikasini.setSchoolName("Vikas");
        vikasini.setSchoolDetail(sd);
        session.save(vikasini);
        t.commit();
        session.close();
 
        session = sessionFactory.openSession();
 
        TypedQuery query=session.createQuery("from School");    
        List<School> list=query.getResultList();   


        Iterator<School> itr=list.iterator();    
        while(itr.hasNext()){    
            School q=itr.next();    
            System.out.println("School Name: "+q.getSchoolName());    

            SchoolDetail sdtl=q.getSchoolDetail();    
            System.out.println("School Name: "+sdtl.getSchoolAddress());  
 
            
    }

      session.close();

        /*
         * Example for detched
         */


       session = sessionFactory.openSession();
 
        session.beginTransaction();
        School sch2 = session.get(School.class, 2);
        session.close();

        Session session2 = sessionFactory.openSession();
 
        session2.beginTransaction(); 

            sch2.setSchoolName("Altered in different session");
            session2.save(sch2);
        //    session2.persist(sch2);
        session2.getTransaction().commit();
        session2.close();

sessionFactory.close();
    }
}
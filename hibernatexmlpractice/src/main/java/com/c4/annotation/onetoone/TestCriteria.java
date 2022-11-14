package com.c4.annotation.onetoone;

import java.util.Arrays;
import java.util.List;
 
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
 
public class TestCriteria {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Prep work
                    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
                    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
 
                    SessionFactory sessionFactory = meta.getSessionFactoryBuilder().build();

                    Session session = sessionFactory.openSession();
                    Transaction tx = session.beginTransaction();
 
                    //Get All Employees
                    System.out.println("GET ALL EMPLOYEES=============");

                    Criteria criteria = session.createCriteria(Employee.class);
                    List<Employee> empList =   criteria.list();

                    for(Employee emp: empList) {
                        System.out.println("Employee ID: "+emp.getId()+"zipcode: "+emp.getAddress().getZipcode());
                    }
                    
                 // GET perticular ID
                    criteria = session.createCriteria(Employee.class)
                                       .add(Restrictions.eq("id", 3))    ;

                    Employee employee = (Employee) criteria.uniqueResult();

                   System.out.println("Name: "+employee.getName()+" , city: "
                               +employee.getAddress().getCity());

                   
//                 //    PAGINATION example

                   empList =        session.createCriteria(Employee.class)
                   .addOrder(Order.desc("id"))
                   .setFirstResult(0)
                   .setMaxResults(2)
                   .list();


                   for(Employee emp1: empList) {
                       System.out.println("Employee id: "+emp1.getId()+" zipcode: "+emp1.getAddress().getZipcode());
                   }

               //Like
                   empList =    session.createCriteria(Employee.class)
                   .add(Restrictions.like("name", "%i"))
                   .list();
                   for(Employee emp2: empList) {
                       System.out.println("Name: "+emp2.getName()+" , city: "
                               +emp2.getAddress().getCity());   
                    // Projections

                       long count  =    (Long) session.createCriteria(Employee.class)
                               .setProjection(Projections.rowCount())
                               .add(Restrictions.like("name", "%i"))
                               .uniqueResult();
                       System.out.println("Number of reords: "+count);

       //Projections for aggregation

                   double sumOfSalary =    (Double) session.createCriteria(Employee.class)
                       .setProjection(Projections.sum("salary"))
                       .uniqueResult();
                   System.out.println("Sum of Salary: "+sumOfSalary);
   //Projection list
                   criteria = session.createCriteria(Employee.class,"employee");
                   criteria.setFetchMode("employee.address", FetchMode.JOIN);
                   criteria.createAlias("employee.address", "address");

                   ProjectionList columns = Projections.projectionList()
                           .add(Projections.property("name"))
                           .add(Projections.property("address.city"));
                   criteria.setProjection(columns);

                   List<Object[]> list = criteria.list();
                   for(Object[] arr:list) {
                       System.out.println(Arrays.toString(arr));
                   }
                   
                    session.close();
                   }
    }
}
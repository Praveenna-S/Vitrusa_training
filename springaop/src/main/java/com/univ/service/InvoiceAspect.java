package com.univ.service;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class InvoiceAspect {

    @Pointcut("execution (public void com.univ.service.PrimaryBusinessService.saveInvoice() )")
    public void saveAspect() {

    }

    @Pointcut("execution (public String com.univ.service.PrimaryBusinessService.listInvoice() )")
    public void listInvoiceAspect() {
 
    }
    @Pointcut("execution (public void com.univ.service.PrimaryBusinessService.populateInvoice() )")
    public void populateAspect() {
 
    }
	@Before("saveAspect()")
    public void beginTransaction() {
 
        System.out.println("Transaction Begins Aspect !");
    }
	
    @AfterReturning("saveAspect()")
    public void commitTransaction() {
 
        System.out.println("Commit Transaction !");
    }
    
    @After("saveAspect()")
    public void completeTransaction() {
 
        System.out.println("Complete Transaction!");
    }
    
    @AfterThrowing(value = "saveAspect()", throwing = "th")
    public void rollBackTransaction(Throwable th) {
 
        System.out.println("Roll Back Transaction from Aspect!" + th);
    }
    
    @AfterReturning(value = "listInvoiceAspect()",returning = "obj")
    public void listInvoiceReview(Object obj) {
        System.out.println("Returning value is: "+obj);
    }
    
    @Around("populateAspect()")
    public void populateAroundInvoice(ProceedingJoinPoint pj) throws Throwable {
 
        System.out.println("Before Populate Invoice!");

        pj.proceed();
        System.out.println("After Populate Invoice");
    }
 
 
    

}

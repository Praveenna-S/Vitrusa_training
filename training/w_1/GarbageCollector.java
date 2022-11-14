package com.training.w_1;

public class GarbageCollector {

    public static void main(String[] args)  
     {  
    	GarbageCollector obj = new GarbageCollector();  
         System.out.println(obj.hashCode());  
         obj = null;  
         // calling garbage collector   
         System.gc();  
         System.out.println("end of garbage collection");  

     }  
     @Override
     protected void finalize()  
     {  
         System.out.println("finalize method called");  
     }  
 }
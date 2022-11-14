package com.training.w_1;

public class Thread3Join extends Thread
{
     public void run()
     {
          for(int i=1;i<=3;i++) {
               try
               {
                Thread.sleep(3000);
               }
           catch(Exception e){
               System.out.println("excep: "+e.getMessage());
           }
          System.out.println("Thread name & value: "+ Thread.currentThread().getName() +
                  " & "+i);
          }
     }
     
        public static void main(String[] args){
         Thread3Join t1=new Thread3Join();
         Thread3Join t2=new Thread3Join();
         Thread3Join t3=new Thread3Join();
         t1.start();
         try
         {
          t1.join();
         }catch(Exception e){
             System.out.println(e);
         }
         t2.start();
         t3.start();
 }


}
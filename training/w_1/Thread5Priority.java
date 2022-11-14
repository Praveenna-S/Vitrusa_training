package com.training.w_1;


public class Thread5Priority extends Thread {
    public void run()
    {
        System.out.println("running thread name is "+ Thread.currentThread().getName());
         System.out.println("running thread priority is "+ Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        Thread5Priority m1= new Thread5Priority();
        Thread5Priority m2=new Thread5Priority();
        m2.start();//1
        m1.start();//0
        m2.setPriority(MIN_PRIORITY);
        m1.setPriority(MAX_PRIORITY);
    }

}
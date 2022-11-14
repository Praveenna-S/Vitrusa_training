package com.training.w_1;

public class Thread4 extends Thread
{
    public void run()
    {
        System.out.println("running the thread");
    }
    public static void main(String[] args)
    {
    	Thread4 t1=new Thread4();
    	Thread4 t2=new Thread4();
    	Thread4 t3=new Thread4();
        System.out.println("thread 1 name by default is:"+ t1.getName());
        System.out.println("thread 2 name by default is:"+ t2.getName());
        System.out.println("thread 3 name by default is:"+ t3.getName());
        t1.start();
        t2.start();

        t1.setName("Audio thread");
        System.out.println("new name of thread1 is:"+ t1.getName());
    }

}
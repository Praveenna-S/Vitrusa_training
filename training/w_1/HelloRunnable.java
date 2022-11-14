package com.training.w_1;

public class HelloRunnable implements Runnable {
	 
    public void run() {
        System.out.println("Hello from a thread!");
    }
 
    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
        (new Thread(new HelloRunnable())).start();

        Runnable runnable = new HelloRunnable();    

        Thread thread = new Thread(runnable); 
        thread.start();
    }
 
}
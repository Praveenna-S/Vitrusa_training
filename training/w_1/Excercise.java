package com.training.w_1;

import java.util.Scanner;

public class Excercise {
	public static void main(String[] args) {
		
		//Hello World
        System.out.println("Hello World..!!"); 
        
    	//datatypes
    	float a=10.345f;
    	double b=23.3;
    	double c=(double) a;
    	System.out.println(c);
    	
    	//Keyborad inputs
    	Scanner sc=new Scanner(System.in);
    	int n1=sc.nextInt();int n2=sc.nextInt();int n3=sc.nextInt();int n4=sc.nextInt();int n5=sc.nextInt();
    	int sum=n1+n2+n3+n4+n5;
    	System.out.println(sum);
    }


}

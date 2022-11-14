package com.training.w_1;

public class MethodOverloading { 
	
	private static void display(int a){
        System.out.println(a);
    }

    private static void display(int a, int b){
        System.out.println(a + " and " + b);
    }

    public static void main(String[] args) {
        display(1);
        display(2,3);
    }
}
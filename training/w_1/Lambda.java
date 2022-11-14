package com.training.w_1;

@FunctionalInterface
interface Sum
{
	public void sum(int a,int b);
}
public class Lambda {
	public static void main(String[] args) {
        Sum s = (a,b) -> System.out.println("The sum of numbers is: " + (a + b));
        s.sum(24, 14);
    }
}

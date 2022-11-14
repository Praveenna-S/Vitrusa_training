package com.training.w_1;

public class MethodInvoking {
	
	public void msg()
	{
		System.out.println("Helloo");
	}
	
	public void display(int a,int b)
	{
		System.out.println(a+b);
		msg();
	}
	
	public static void main(String[] args)
	{
		MethodInvoking obj=new MethodInvoking();
		obj.display(1, 2);
	}

}

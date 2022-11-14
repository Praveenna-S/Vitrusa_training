package com.training.w_1;

public class MethodOverriding {
	
	void method() {
	System.out.println("This is the first method");	
	}
}

class Overriden extends MethodOverriding
{
	void method()
	{
		System.out.println("This is the overriden method");
	}
	
	public static void main(String[] args)
	{
		Overriden obj=new Overriden();
		obj.method();
	}
	
}
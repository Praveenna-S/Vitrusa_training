package com.training.w_1;

public class Constructors {
	String name;
	int age;
	Constructors()
	{
		System.out.println("Default constructor");
	}
	
	Constructors(String name,int age)
	{
		System.out.println("Parameterized constructor");
		System.out.println(name+" "+age);
	}
	
	public static void main(String[] args)
	{
		Constructors c=new Constructors();
		Constructors c1=new Constructors("praveenna",22);
		
	}

}

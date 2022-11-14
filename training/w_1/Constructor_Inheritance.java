package com.training.w_1;



class Constructor_Inheritance {
	
	Constructor_Inheritance()
	{
		System.out.println("Parent class constructor");
	}
}

class ChildClass extends Constructor_Inheritance{
	ChildClass()
	{
		System.out.println("Child class constructor");
	}
}
class Constructor
{
	public static void main(String args[])   {
		 new ChildClass();
	 }
}


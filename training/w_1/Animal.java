package com.training.w_1;

interface Animal {
	public void animalSound();
	public void state();
}

class Dog implements Animal 
{
	public void animalSound()
	{
		System.out.println("Barks");
	}
	public void state()
	{
		System.out.println("Sleeping");
	}
}

class Cat implements Animal 
{
	public void animalSound()
	{
		System.out.println("Meow");
	}
	public void state()
	{
		System.out.println("walking");
	}
}

class Event
{
	public static void main(String[] args)
	{
		Animal a=new Dog();
		a.animalSound();
		a.state();
	}
}

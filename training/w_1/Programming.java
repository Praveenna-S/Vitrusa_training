package com.training.w_1;
//Implemention of Interface using Abstract Class


public interface Programming {
	void learnCoding();
	void learnProgrammingLanguage();
	void contribute();
}

abstract class Student implements Programming {

	// Overriding the methods
	@Override public void learnCoding()
	{
		System.out.println(
			"Let's make coding a habit");
	}
	@Override public void learnProgrammingLanguage()
	{
		System.out.println(
			"Let's master all fundamentals of java");
	}
}

class Progam extends Student {
	@Override public void contribute()
	{
		System.out.println(
			"Now let's help");
	}
}


 class Main {
	public static void main(String[] args)
	{
		
		Progam programStudent = new Progam();

		// Calls to the multiple functions
		programStudent.learnCoding();
		programStudent.learnProgrammingLanguage();
		programStudent.contribute();
	}
}

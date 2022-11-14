package com.training.w_1_Day14;
import java.lang.annotation.*;


@CustomTypeAnnotation(doAnnotate = "new annotation")
public class Main {
	
	public static void main(String[] args)
	{
		Main m1= new Main();
		Annotation[] anno= m1.getClass().getAnnotations();
		System.out.println("Annotations on the type or class "+ anno[0]);
	}

}

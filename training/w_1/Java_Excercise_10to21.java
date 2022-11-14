package com.training.w_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Java_Excercise_10to21 {
	public static void main(String[] args) throws Exception
	{
		
		//10.Numeric array Sorting 
		/*int a[]= {1,56,34,78,22,77,0,88};
		Arrays.sort(a);
		for(int i=0;i<8;i++)
		{
			System.out.println(a[i]);
		}
		
		//10.String array sorting
		 String[] fruits = {"Banana", "Blackberry", "Date", "Fig", "Mulberry",  "Apple", "Custard apple",  "Apricot"};  
		 Arrays.sort(fruits);  
		 System.out.println(Arrays.toString(fruits)); 
		 
		  
		//11. Reverse interger array
		int a[]= {1,56,34,78,22,77,0,88};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		
		
		//12.Duplicate values of integer array
		int arr[]= {1,88,1,34,56,34,78,22,77,0,88};
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  	
		}
	
	
		//13.Duplicate values in staring array
		String arr[]= {"abc","abc","dgf","dfg","gts","dgf"};
		for(int i = 0; i < arr.length; i++) {  
        	for(int j = i + 1; j < arr.length; j++) {  
            	if(arr[i] == arr[j])  
                System.out.println(arr[j]);  
        	}  	
		}


		//14 & 15. First half of the string of even length
		String s="Pthyon";
		int n=s.length();
		if(n%2 == 0)
		System.out.println(s.substring(0,n/2));
		}
		
		
		//16.Find value
		//a.
		//System.out.println((101)/3);
		
		//b.
		//System.out.println(1/0);
		
		//c.
		//System.out.println(true&& true);
		
		//d.
		//System.out.println(false&& true);
		
		//e.
		//System.out.println((false&&false)||(true&& true));
		
		//f.
		//System.out.println((false&&false) && (true&& true));
		
		
		
		//18.String to Date
		String date="14/08/2022";
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		System.out.println(date+" "+date1);
		
		
		//20.Count no. of vowels
		String s="Praveenna";
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				c++;
			}
		}
		System.out.println(c);   */
		
		
		//21. If the 3 numbers are consecutive or not
		int n1=15;
		int n2=16;
		int n3=17;
		if((n2-n1)==1 && (n3-n2)==1)
			System.out.println("true");
		else
			System.out.println("false");
		
		
	}
}

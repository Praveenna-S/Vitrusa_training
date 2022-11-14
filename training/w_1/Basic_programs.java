package com.training.w_1;

import java.util.Scanner;

public class Basic_programs {
	
	/*static int fac(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*fac(n-1));
	}
	
	static void print1to10(int n1)
	{
		if(n1<=10)
		{
			System.out.println(n1);
			print1to10(n1+1);
		}
	}*/
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		//int n2=s.nextInt();
		
		
		//Even or Odd
		/*if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		
		//Factorial of given number
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println(n+":"+f);
		
		
		//Factorial using recursion
		int f=1;
		f=fac(n);
		System.out.println(n+":"+f);
		
		
		//Swapping 2 numbers
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println(n1+" "+n2);
		
		n1=n1*n2;
		n2=n1/n2;
		n1=n1/n2;
		System.out.println(n1+" "+n2);
		
		
		//swap using XOR
		n1=n1^n2;
		n2=n1^n2;
		n1=n1^n2;
		System.out.println(n1+" "+n2);
		
	/*	
		//Postive or negative
		if(n1>0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
		
		//Leap year or not
		boolean leap=false;
		if (n1 % 4 == 0) {
		      if (n1 % 100 == 0) {
		        if (n1 % 400 == 0)
		          leap = true;
		        else
		          leap = false;
		      }
		      else
		        leap = true;
		    }
		    else
		      leap = false;

		    if (leap)
		      System.out.println(n1 + " is a leap year.");
		    else
		      System.out.println(n1 + " is not a leap year.");
		
		
		//Print 1 to 10 without loop
		print1to10(1);
		
		//Digits in given number
		int rem=0;
		while(n1>0)
		{
			rem=n1%10;
			System.out.println(rem);
			n1=n1/10;
		}
		
		
		//Factors of a givene number
		for(int i=1;i<n1;i++)
		{
			if(n1%i==0)
			{
				System.out.println(i);
			}
		}
		
		
		//Sum of digits of given number
		int rem=0,sum=0;
		while(n1>0)
		{
			rem=n1%10;
			sum=sum+rem;
			n1=n1/10;
		}
		System.out.println(sum);
		
		//Smallest of 3 numbers
		int a,b,c,smallest;
		System.out.println("Enter the first number:");  
		a = s.nextInt();  
		System.out.println("Enter the second number:");  
		b = s.nextInt();  
		System.out.println("Enter the third number:");  
		c = s.nextInt();  
		smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b);  
		System.out.println("The smallest number is: "+smallest);  
		
		
		//Add 2 numbers
		
		//Reverse a given number
		
		int rem=0,rev=0;
		while(n1!=0)
		{
			rem=n1%10;
			rev=(rev*10)+rem;
			n1=n1/10;
		}
		System.out.println(rev);
		
		
		//GCD of 2 nos
		
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i == 0 && n2%i ==0)
				gcd=i;
		}
		System.out.println(gcd);
		
		//LCM
		int lcm;
		lcm = (n1 > n2) ? n1 : n2;

	    // Always true
	    while(true) {
	      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
	        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
	        break;
	      }
	      ++lcm;
	    }
	    
	    
	    //Palindrome
	    
	    int reversed = 0, remainder, original=n1;
	    while (n1 != 0) {
	        remainder = n1 % 10;
	        reversed = reversed * 10 + remainder;
	        n1 /= 10;
	    }
	    
	    if (original == reversed)
	    	 System.out.printf("%d is a palindrome.", original);
	    else
	    	 System.out.printf("%d is not a palindrome.", original);
	    
	    
	    
	    //prime factors
	    
	    for(int i = 2; i< n1; i++) {
	         while(n1 %i == 0) {
	            System.out.println(i+" ");
	            n1 = n1/i;
	         }
	      }
	 
	    
	    //prime or not
	    
	    boolean flag = false;
	    for (int i = 2; i <= n1 / 2; ++i) {
	      if (n1 % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(n1 + " is a prime number.");
	    else
	      System.out.println(n1 + " is not a prime number.");
	  
		
		
		
	//prime no from 1 to n
		int counter,j;
		for( j=2;j<=n1;j++){
	         counter=0;
	         for(int i=1;i<=j;i++){
	            if(j%i==0){
	               counter++;
	            }
	         }
	         if(counter==2)
	         System.out.print(j+" ");       
	
	    }
		
		
		//Armstrong number
		int count=0,a,b,c,sum=0;
		  a = n1;
	        c = n1;
	        while(a > 0)
	        {
	            a = a / 10;
	            count++;
	        }
	        while(n1 > 0)
	        {
	            b = n1 % 10;
	            sum = (int) (sum+Math.pow(b, count));
	            n1 = n1 / 10;
	        }
	        if(sum == c)
	        {
	            System.out.println("Given number is Armstrong");
	        }
	        else
	        {
	            System.out.println("Given number is not Armstrong");
	        }  
	        
	        
	        //Armstrong number from 1-1000
		int n1,b,sum=0;
		for(int i=1;i<=1000;i++)
		{
			n1=i;
			while(n1>0)
			{
				b = n1 % 10;
                sum = sum + (b * b * b);
                n1 = n1 / 10;
			}
			if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
		}*/
		
		//Perfect number
		int sum=0;
		   for(int i = 1; i < n1; i++)
	        {
	            if(n1 % i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	        if(sum == n1)
	        {
	            System.out.println("Given number is Perfect");
	        }
	        else
	        {
	            System.out.println("Given number is not Perfect");
	        }    
	    }
	
	
	//
		
}

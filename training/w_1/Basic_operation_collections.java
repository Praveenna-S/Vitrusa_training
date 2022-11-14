package com.training.w_1;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Basic_operation_collections {
	public static void main(String args[]){ 
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Sankar");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ram");  
		list.add("Rajesh");  
		
		 //Collections.sort(list);  
		//update
		list.add(1,"Sai");
		
		list.set(2,"Helloo");
		
		list.remove(3);
		
		System.out.println(list.get(0));
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		System.out.println(list.contains("Sai"));
		}  
}

package com.training.w_1;

import java.util.ArrayList;

//Bound types in generic
public class Machine {

	 
	   @Override
	   public String toString() {
	       return "I am a machine";
	   }

	   public void start() {
	       System.out.println("Machine starting.");
	   }
	 
	}
	 
	class Camera1 extends Machine {
	   @Override
	   public String toString() {
	       return "I am a camera";
	   }

	   public void snap() {
	       System.out.println("snap!");
	   }
	}
	 
	class GenericsWildCardDemo1 {
	 
	    public static void main(String[] args) {

	        ArrayList<Machine> list1 = new ArrayList<Machine>();

	        list1.add(new Machine());
	        list1.add(new Machine());

	        ArrayList<Camera1> list2 = new ArrayList<Camera1>();

	        list2.add(new Camera1());
	        list2.add(new Camera1());

	        showList(list2);
	        showList2(list1);
	        showList3(list1);
	    }

	    //camera class
	    public static void showList(ArrayList<? extends Machine> list) {
	        for (Machine value : list) {
	            System.out.println(value);
	            value.start();
	            ((Camera1) value).snap();
	        }

	    }
	    
	    //machine class
	    public static void showList2(ArrayList<? super Camera1> list) {
	        for (Object value : list) {
	            System.out.println(value);
	            ((Machine) value).start();
	            
	        }
	    }

	    public static void showList3(ArrayList<?> list) {
	        for (Object value : list) {
	            System.out.println(value);
	            ((Machine) value).start();
	        }
	    }
	 
	}
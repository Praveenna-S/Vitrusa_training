package com.training.w_1;

class Machine_Updowncasting {
    public void start() {
        System.out.println("Machine started.");
    }
}

class Camera extends Machine_Updowncasting {
    public void start() {
        System.out.println("Camera started.");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}

 class UpcastingAndDowncasting
 {
	 public static void main(String[] args)
	 {
		 //Upcasting
		 Machine_Updowncasting machine2 = new Camera();
         machine2.start();
         
         //Downcasting
         Machine_Updowncasting machine3 = new Camera();
         Camera camera2 = (Camera)machine3;
         camera2.start();
         camera2.snap();
	 }
	 
 }
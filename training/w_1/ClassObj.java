package com.training.w_1;
//Class and Object
public class ClassObj {

    private String name;
    private int age;
    public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name= name;
    }
    
    public static void main(String[] args)
	{
		
		ClassObj obj=new ClassObj();
		obj.setName("Praveenna");
		obj.setAge(20);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
	}

}

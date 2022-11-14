package com.training.w_1;

public class Person1 {

    private int id;
    private String name;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person1 other = (Person1) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


}

 class CustomObjectComparison {

    public static void main(String[] args) {

        System.out.println(new Object());

        Person1 person1 = new Person1(5, "Bob");
        Person1 person2 = new Person1(5, "Bob");


        System.out.println(person1.equals(person2));

        Double value1 = 7.2;
        Double value2 = 7.2;

        System.out.println(value1.equals(value2));

        Integer number1 = 6;
        Integer number2 = 6;

        System.out.println(number1.equals(number2));

        String text1 = "Hello";
        String text2 = "Hellodfadf".substring(0, 5);

        System.out.println(text2);

        System.out.println(text1.equals(text2));
    }

}
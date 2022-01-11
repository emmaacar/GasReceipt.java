package day37_Inheritance.ScrumTask;

public class Person {

    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
    }

    public void eat(String food){
        System.out.println(name + " is eating");
    }

    public void drink(String drink){
        System.out.println(name + " is drinking");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}

/*
Create a class named Person
            variables:
                name, age, gender
            methods:
                eat(String food)
                drink(String drink)
                toString()
 */



package day37_Inheritance.AnimalTak;

import day37_Inheritance.AnimalTak.Animal;

public class Parrot extends Animal {

    public String parrotWingColor; // exstra eklemek istersen

    public Parrot(String name, String breed, char gender, int age, String size, String color,String parrotWingColor) {
        super(name, breed, gender, age, size, color);
        this.parrotWingColor =parrotWingColor;  // exstra eklemek icin this key word kullan
    }
    public void fly (){
        System.out.println(name+" is flying");

    }
    public void talk(){
        System.out.println(name+" is talking");
    }
}

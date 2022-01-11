package day37_Inheritance.AnimalTak;

import day37_Inheritance.AnimalTak.Cat;
import day37_Inheritance.AnimalTak.Dog;
import day37_Inheritance.AnimalTak.Parrot;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 =new Dog("Angel","Fench",'F',9,"medium","brown");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("mavi","tekir",'F',2,"small","white");
        System.out.println("cat1 = " + cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("karpuz","chkoniar",'M',3,"small","Green","blue");
        System.out.println(parrot1);
        parrot1.talk();
        parrot1.fly();
    }
}

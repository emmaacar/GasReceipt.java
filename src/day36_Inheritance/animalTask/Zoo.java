package day36_Inheritance.animalTask;

import day36_Inheritance.Cat;

public class Zoo {
    public static void main(String[] args) {

    Dog dog =new Dog();
    dog.setInfo("Angel","Boston Terier",'F',8,"Medium","Brown,White");

       dog.eat();
       dog.drink();
       dog.sleeping();
       dog.moving();
       dog.bark();

        Cat cat =new Cat();
        cat.setInfo("boncuk","tekir",'M',5,"Small","white");

        cat.eat();
        cat.sleeping();
        cat.moving();
        cat.drink();

        Tiger tiger = new Tiger();
        tiger.setInfo("Joe","col kaplani",'M',15,"large","brown");

        tiger.hunt();
        tiger.drink();
        tiger.eat();
        tiger.sleeping();
        tiger.roar();
        // tiger.bark(); not barking





    }
}

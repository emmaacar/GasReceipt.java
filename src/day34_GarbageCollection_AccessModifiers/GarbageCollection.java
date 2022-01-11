package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day30_CustomClass.Student;
import day32_Constructors.Car;
import day33_Statics.Iphone;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        /*

        // int n = null;
        String str = null;  //  null object not excist demek. objec olusturmuyorsun

        System.out.println(str.toUpperCase());

         */

        String str = "Wooden Spoon"; // after line 13 "wooden Spoon" will be eligible for garbage collection
        str = null;

        System.out.println(str);

        Car car1 = new Car("Toyota");

        car1 = null;

        System.out.println(car1);

        System.out.println("====================================");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "max";

        System.out.println(dog1);

        String language = "Python";
        language = " Java";

        System.out.println(language);

        System.out.println("===========================");


        ArrayList<Integer> list1 =new ArrayList<>(); // ayni odaya giden iki farkli kapi

        list1.add(100);

        ArrayList<Integer> list2 =list1;   // ikiside ayni object i barindiriyor

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2); // True

        System.out.println(" ================================= ");



    }
}

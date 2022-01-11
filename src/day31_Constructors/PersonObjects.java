package day31_Constructors;

public class PersonObjects {

    public static void main(String[] args) {

       Person person1 = new Person("Emel",'F',42);

       Person person2 = new Person("Ali",'M',45);

       person2.age =30;  // eger person2 nin yasini degistirmek istersen person2 yi cagirip yeni yasini age e asigne edeceksin

        System.out.println(person1);
        System.out.println(person2);

    }
}

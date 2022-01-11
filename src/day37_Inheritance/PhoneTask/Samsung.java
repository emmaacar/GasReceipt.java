package day37_Inheritance.PhoneTask;

public class Samsung extends Phone {


    public Samsung(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }
    public void freeze(){
        System.out.println(brand+" "+model+" is freezing");
    }
}
/*
    Create a sub class of Phone named Samsung:
        Variables:
        brand, model, size, price, color

        Methods:
        setInfo()
        call(long phoneNumber)
        text(long phoneNumber)
        freeze()
        toString()

 */
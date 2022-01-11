package day37_Inheritance.PhoneTask;

public class Iphone extends Phone {


    public Iphone(String brand, String model, String size, double price, String color) {
        super("Apple", model, size, price, color);

    }

    public void faceTime(long phoneNumber) {
        System.out.println(brand + model + " is having a face timing" + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(brand + model + " is having a face time with email" + email);
    }
}

/*
 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

	Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

 */
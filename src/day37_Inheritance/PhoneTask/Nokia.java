package day37_Inheritance.PhoneTask;

public class Nokia extends Phone{
    public Nokia(String brand, String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
    public void selfDefence(){
        System.out.println(" You can use"+model+brand+" "+" is SelfDefencing");
    }

    /*
    Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()

     */
}

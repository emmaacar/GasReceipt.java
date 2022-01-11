package day37_Inheritance.PhoneTask;

public class PhoneShop{
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12","x plus","medium",125888,"white");

        Samsung samsung = new Samsung("galaxy 10","kl5","plus",125896,"pink");

        Nokia nokia = new Nokia("Nokia","kl58","small",15555,"black");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        System.out.println("-----------------------");

        samsung.call(23589878);
        samsung.text(154879577);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(78945613);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);









    }

    }


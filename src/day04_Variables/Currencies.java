package day04_Variables;

import javax.lang.model.SourceVersion;

public class Currencies {

    public static void main(String[] args) {
        // $1000
        int dollar = 1000;

        double lira = dollar * 9.53;
        double euro = dollar * 0.85;
        //jpy,pound peso, cad, riyal,rub
        double JPY = dollar * 114.4;
        double pound =dollar * 0.73;
        double CAD =dollar * 1.24;

        System.out.println("dollar = " + dollar);
        System.out.println("euro = " + euro);
        System.out.println("JPY = " + JPY);
        System.out.println("pound = " + pound);
        System.out.println("CAD = " + CAD);

    }
}

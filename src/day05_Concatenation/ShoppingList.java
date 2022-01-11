package day05_Concatenation;

import javax.lang.model.SourceVersion;

public class ShoppingList {
    public static void main(String[] args) {


        String item1 = "Tomatoes Price";
        String item2 = "Cheese Price";
        String item3 = "Apples Price";


        double price1 = 5.5;
        double price2 = 3.5;
        double price3 = 6.3;
        double totalPrice = price1 + price2 + price3;
        System.out.println("item1" +": "+ item1 + ": "+price1+"," +" item2" +": "+item2+": "+price2+","+" item3"+": "+item3 +": "+price3+"\n"+"totalPrice"+": "+totalPrice);
    }
}

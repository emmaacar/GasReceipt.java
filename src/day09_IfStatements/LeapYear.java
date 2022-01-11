package day09_IfStatements;

import java.time.Year;

public class LeapYear{
    public static void main(String[] args) {

     int Year =2000;

     boolean leapYear = Year % 4 == 0;

        if (leapYear) {
            System.out.println("Year "+ Year+"is a leap year");
        }
        if(!leapYear) {
            System.out.println("Year "+ Year +"is a NOT leap year");

            System.out.println("--------------------------");

            if (leapYear) {
                System.out.println("Year" + Year + "is a leap year");
            }else{
                System.out.println("Year" + Year + "is not a leap year");

            }
        }
    }
}


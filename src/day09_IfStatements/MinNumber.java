package day09_IfStatements;

public class MinNumber<n2IsMin, n1IsMin, equal> {
    public static void main(String[] args) {


        int n1 = 100;
        int n2 = 200;

        boolean n1Minimum = n1 < n2;
        boolean n2minimum = n2 < n1;
        boolean equal = n1 == n2;

        /*

        if(n1 < n2){
            System.out.println(n1+" is the minimum number");
        }
         */

        if(n1Minimum){
            System.out.println(n1 + "is the minimum number");

            if(n2minimum){
                System.out.println(n2+ " is the minimum number");

                if(equal){
                    System.out.println("equal" );
                }
            }
        }
    }

}








/*
1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal
			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number

			n1 & n2
			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */




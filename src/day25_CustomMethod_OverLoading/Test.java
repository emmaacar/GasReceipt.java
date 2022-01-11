package day25_CustomMethod_OverLoading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str ="Java Programing Language";

        StringUtility.printEachChar(str);

        System.out.println("------------------");

        String s1 ="Cydeo School";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);
        System.out.println("-------------------------");

        boolean palindrome = StringUtility.isPalindrome(str);
        System.out.println("palindrome = " + palindrome);

        System.out.println("--------------------------");

         String []names={"Anna","Java","Python","recacar","Mom","cydeo"};
        int count=0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }


    }

}


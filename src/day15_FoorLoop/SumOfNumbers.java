package day15_FoorLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        int total = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            total +=scan.nextInt();
            System.out.println("total"+total);
            scan.close();

        }

        }

        }




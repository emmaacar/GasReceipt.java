package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hw many number woud you like to enter?");
        int length = scan.nextInt(); //5 buraya hangi numarayi verirsen length o numaradan fazla yada az olamaz

        if (length <= 0) {
            System.err.println("Invalid number");
            System.exit(0);
        }


        int[] numbers = new int[length];  // array needs to have enought capacity to contain the elements user going to enter

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {

                System.out.println("Enter a number");
                numbers[i]=scan.nextInt();  // each input user provided during each execution of the loop, will be assigned to the indexes of the array

                System.out.println(Arrays.toString(numbers));
                scan.close();

            }

            }

        }

    }

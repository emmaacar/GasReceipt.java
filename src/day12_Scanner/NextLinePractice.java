package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt(); // 19
        
        scan.nextLine(); //Enter
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your GPA");
        double gpa = scan.nextDouble(); //3.5

        scan.nextLine(); //Enter
        System.out.println("School Name");
        String schoolName = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        scan.close();
    }
}
      /*
      1. Ask the user to enter age (nextInt() )
      2. Ask the user to enter full name (nextLine() )
      */
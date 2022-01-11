package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); //
        
        System.out.println("Enter your full name");
        String fullName = scan.nextLine(); // Emel Acar

        System.out.println("Enter programing Language");
        String programing = scan.nextLine(); // Java programing languageEnter

        System.out.println("Enter yor age");
        int age = scan.nextInt(); // 41

        scan.nextLine(); // capture the entre the key that user pressed for nextInt()

        System.out.println("Enter yor School Name");
        String schoolName = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programing = " + programing);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
       
                scan.close();
        
    }
    
    
}

package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int n = 100;

        if (n > 0) {
            System.out.println("positive");
        }
        if (n < 0) {
            System.out.println("negative");
        }
        if (n == 0) {
            System.out.println("zero");
        }
        System.out.println("----------------------------");

        boolean positive = n > 0;
        boolean negative = n < 0;

        if (positive) {
            System.out.println("positive");

        } else if (negative) {
            System.out.println("negative");

        } else {
            System.out.println("zero");

            System.out.println(" ----------------------");

            if (positive) {
                System.out.println("positive");

                if (negative) {
                    System.out.println("negative");

                } else {
                    System.out.println("zero");
                }
            }
        }

    }
}
        // if else statement we can NEVER apply for the tasks that requires teo condition!!


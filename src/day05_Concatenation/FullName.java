package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {
        String firsName  = "Emel";
        String lastName  ="Acar";
        int age = 69;
        String jobTitle = "SDET";
        String companyName = " Apple Inc";
        double salary = 100000.58;

        String fullName = firsName + " " + lastName;

        //Full name of the person is ________
        System.out.println(" Full name of the person is " + fullName );

        //___  is ___years old

        System.out.println(fullName + " is " + age + " years old" );
        // FullName is jobTitle ,work at companyName and fullName' salary is salary

    }
}

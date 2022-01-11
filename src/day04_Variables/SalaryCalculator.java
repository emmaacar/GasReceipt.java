package day04_Variables;

import javax.lang.model.SourceVersion;

public class SalaryCalculator {

    public static void main(String[] args) {
        // hourly Rate, weeklyHours

        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeeks = 4;

        int salary = hourlyRate * weeklyHours * 52;

        //system.out.println(salary);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = " + salary);

    }
}








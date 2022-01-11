package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {

        int day = 5;  // 1 ~ 7 haftanin 5. gununu hangisidir ?

        if (day== 1) {
            System.out.println("Monday");
        } else if (day== 2) {
            System.out.println("Tuesday ");
        } else if (day== 3) {
            System.out.println("Wednesday");
        } else if (day== 4) {
            System.out.println("Thursday");
        } else if (day== 5) {
            System.out.println("Friday");
        }else if (day== 6){
            System.out.println("Saturday");
        }else if (day== 7){
            System.out.println("Sunday");
        }
        System.out.println("---------------------------- ");

        String dayName;

        if (day == 1) {
            dayName = "Monday";
        }else if(day==2) {
            dayName = "Tuesday";
        }else if (day==3) {
            dayName = "Wednesday";
        }else if(day==4){
            dayName ="Thursday";
        }else if(day==5){
            dayName ="Friday";
        }else if(day==6) {
            dayName = ("Saturday");
        }else if (day==7) {
            dayName = ("Sunday");
        }else{
            dayName ="invalid";
            System.out.println(dayName);

        }
    }

}



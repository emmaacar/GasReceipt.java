package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // >, >=, < , <=

        boolean result1 =  200 > 40; // true

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150 ; // true

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100; //true

        System.out.println("result3 = " + result3);

        boolean result4 =  300 >= 500; // false

        System.out.println("result4 = " + result4);

        // credit score of 720
        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720; // if the credit score is 720 or greater, then it's eligible for the loan


        boolean result5 = 100 < 120; // true
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180; // false
        System.out.println("result6 = " + result6);

        int score = 75;
        boolean hasFailed =  score <= 59; // false
        //                      75 <= 59

        System.out.println("hasFailed = " + hasFailed);


        boolean result7 =  45 <= 60;

        System.out.println("result7 = " + result7);



    }
}

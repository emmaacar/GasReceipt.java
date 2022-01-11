package day20_Arrays;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] number = {2 ,4 , 6, 20, 80, 100};
        int min = number[0];

        for (int i = 0; i < number.length; i++) {  // i: 0,1,2,3,4,5...

            if (number[i] < min) {

                min= number[i];
            }

            System.out.println(min);
        }


    }
}

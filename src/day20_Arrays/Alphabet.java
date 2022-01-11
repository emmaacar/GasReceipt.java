package day20_Arrays;

import day15_FoorLoop.ForLoopIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class Alphabet {


    public static void main(String[] args) {


        char[] alphabets = new char[26];  // Z~A

        /*         i   ch
        alphabets[0] ='Z';        26 harfi tek tek yazmamak icin loop kullanicaz.
        alphabets[1] ='Y';
        alphabets[2] ='X';      //** eger degeri biliyorsak {} bunun icine girip yaziyoruz
                                //** eger degeri bilmiyorsak ozaman new kelimesini kullanicaz
         */


        char ch = 'Z';
        for (int i = 0; i < alphabets.length ; i++, ch--) {
            alphabets[i] =ch;

        }

       // System.out.println(alphabets);

        System.out.println(Arrays.toString(alphabets));  // print the whole array
        System.out.println(alphabets[0]); //printing the element of array

    }
}

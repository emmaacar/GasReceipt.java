package day20_Arrays;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        // create a variable that's capable enough to contain 5 names

        String[] myGroup = new  String[5]; // 0~4 o nedenle  muhtari print etmez
        myGroup[0] ="Gunay";
        myGroup[1] ="Naire";
        myGroup[2] ="Suat";
        myGroup[3] ="Hulya";
        myGroup[3] ="Mikael";
        // myGroup[5] ="Muhtar";// myGroup[-1]= "Adam";   // en kucuk index 0 oldugu icin  Adam da print olmaz
        // System.out.println(myGroup); // hashcode  direk diklare edemezsin
        // bu yontemi kullanirken  kac element oldugunu bildiginde ama elementlerin ne oldugunu bilmediginde kullanirsin
        System.out.println(Arrays.toString(myGroup));  //[ "Gunay","Neira","Suat","Hulya","Micael"

        System.out.println("------------------------------------");

        String[] days = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        // index            0          1         2           3         4         5         6

        // kac gun oldugunu bildigimiz icin numarayi asigne etmemize gerek yok

        System.out.println(Arrays.toString(days));

        int number =1;

        if(number < 1 || number > 7){
            System.out.println("Invalid number");
            System.exit(0);

            System.out.println( days[number] );
        }
    }
}

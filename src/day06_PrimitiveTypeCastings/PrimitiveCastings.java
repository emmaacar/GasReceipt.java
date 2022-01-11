package day06_PrimitiveTypeCastings;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class PrimitiveCastings<d1>  {
    public static void main(String[] args) {




    byte a = 100;
    short b = a;
    //short b =  (short)a;
    //        (short)a

    int c = b; // implicit casting
    //int c = (int)b

    long d = c;
    //    (long)c

    float e = d;
    double f = e;
     System.out.println("...................");

    int x = 55;
    short y = (short) x; // explicit casting

     System.out.println("");

    long j = 1000000;
    short k = (short) j;

    double d1 = 20.5;
    short s1 = (short) d1;





        System.out.println(d1 + ":"+ s1);


        float f1 = 30.5F;
        long l1 = (long) f1;












}
}



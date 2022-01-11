package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {


    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        // add(Data0 add the date after the last index of the Arraylist
        numbers.add(10);  //0
        numbers.add(20);  //1
        numbers.add(30);  //3
        numbers.add(40);  //4
        numbers.add(50);  //5
        numbers.add(60);  //6

        numbers.add(2,25);  //2 index numarasini giriyorsun yeni bir numara eklemek istediginde
        numbers.add(5,45);  //5
        System.out.println(numbers);      // yeni element eklenince eskisi saga kayiyor yok olmuyor

        System.out.println(numbers);
        System.out.println( numbers.size() );
        int lastIndex = numbers.size() - 1;

        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println( numbers.get(i) );
        }

        System.out.println("----------------------------------");

        // replace  :
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript"); // replace
        list.set(3, "C++");
        System.out.println(list);

        System.out.println("=======================");

        //remove (int)  : elementi, verdigin intigar numarasina gore siliyor

        ArrayList<String> employees = new ArrayList<>();

        employees.add("suat");
        employees.add("aytug");
        employees.add("olga");
        employees.add("naira");
        employees.add("ali");
        employees.add("hulya");
        employees.add("kaloyan");

        System.out.println(employees);
        employees.remove(0);

        System.out.println(employees);
        employees.remove(0);

        System.out.println(employees);
        employees.remove(0);

        System.out.println(employees);
        employees.remove(1);

        System.out.println(employees);
        employees.remove(-1);  // buda en sondaki elementi siler 

        System.out.println(employees);
        
        employees.remove("hulya");  // remove objek remove metodu boolean e donuyor ayni zamanda. TEK BIR ELEMENT SILIYOR BIR SEFERDE
        System.out.println(employees);
        
        boolean r1 =employees.remove("ali");
        System.out.println("r1 = " + r1);



    }


    }


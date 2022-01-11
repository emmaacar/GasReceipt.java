package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main Method");  // en once static  block geciyor yukaridan assagiya geciyor ve bir kerede fazla run etmez
    }

    static { // runs first before anything, and only runs one time
        System.out.println("Static Block 1");

    }

    static { // runs first before anything
        System.out.println("Static Block 2");

    }

    static { // runs first before anything
        System.out.println("Static Block 3");

    }
}

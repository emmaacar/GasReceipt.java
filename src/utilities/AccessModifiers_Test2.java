package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
      //  System.out.println(AccessModifiers.defaultData); // default Access modifier is not visible outside the package
        // System.out.println(AccessModifiers.privateData); // privite accsess modfier is not visible outside class


        AccessModifiers.method1();
       //  AccessModifiers.method2();
       //  AccessModifiers.method3();
    }
}

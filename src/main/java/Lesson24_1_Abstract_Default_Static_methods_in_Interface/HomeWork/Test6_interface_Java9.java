package Lesson24_1_Abstract_Default_Static_methods_in_Interface.HomeWork;

public class Test6_interface_Java9 {
}

interface I1 {
    static void metod1() {
        System.out.println("Static method1");
        metod2();
        metod1();
    }

    private static void metod2() {
        System.out.println("Static method2");
    }

    private void metod3() {
        System.out.println("Hello");
    }

    abstract void metod4();

    default void metod5() {
        metod1();
        metod2();
        metod3();
        metod4();
        metod5();
    }
}
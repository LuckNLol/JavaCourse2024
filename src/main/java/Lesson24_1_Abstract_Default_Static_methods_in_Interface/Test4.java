package Lesson24_1_Abstract_Default_Static_methods_in_Interface;

public class Test4 {
}

interface I1{
    void abc();
    default void def(){
        System.out.println("это метод def");
    }
}

class Z2 implements I1{
    public void abc() {
        System.out.println("это метод abc");
    }
    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.def();
    }
    @Override
    public void def() {System.out.println("это метод def");}
}
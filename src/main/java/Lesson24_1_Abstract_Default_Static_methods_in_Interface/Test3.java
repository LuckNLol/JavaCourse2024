package Lesson24_1_Abstract_Default_Static_methods_in_Interface;

public class Test3 {
    Jumpable j1 = new Animal();
    Jumpable j2 = new Human();

}

class Human implements Jumpable{
    public void Jump() {
        System.out.println("Люди прыгают");
    }
}

class Animal implements Jumpable{
    public void Jump() {
        System.out.println("Животные прыгают");
    }
}

interface Jumpable{
    void Jump();
}

interface A2 {void abc();}
interface B2 extends A2, Jumpable {void def();}

abstract class D implements A2, B2 {}
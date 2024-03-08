package Lesson25_Polimorphism_instanseof;

public class Test3 {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();
        Human h = new Human();

        if(j instanceof Jumpable){
            System.out.println("j is Jumpable");
        }
        if(m instanceof Human) {
            System.out.println("m is Human");
        }

        if(h instanceof Human) {
            System.out.println("h is Jumpable");
        }

        if(s instanceof Jumpable) {
            System.out.println("s is Jumpable");
        } else {
            System.out.println("s isn't Jumpable");
        }

    }
}

interface Jumpable{}
class Human implements Jumpable{}

class Man extends Human{}

class Student{}

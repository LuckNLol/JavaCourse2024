package Lesson26_equals_toString_WrapperClasses;

public class Test7 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println();
        Animal animal1 = new Mammal();
        System.out.println();
        Animal animal3 = new Lion();
        System.out.println();
        Lion lion = new Lion();

    }
}


class Animal {
    Animal(){
        System.out.println("Constructor of Animal");
    }
static {System.out.println("Static init of Animal");}
{System.out.println("Non-Static init of Animal");}
}

class Mammal extends Animal {
    Mammal(){
        System.out.println("Constructor of Mammal");
    }
    static {System.out.println("Static init of Mammal");}
    {System.out.println("Non-Static init of Mammal");}
}

class Lion extends Mammal {
    Lion(){
        System.out.println("Constructor of Lion");
    }
    static {System.out.println("Static init of Lion");}
    {System.out.println("Non-Static init of Lion");}
}
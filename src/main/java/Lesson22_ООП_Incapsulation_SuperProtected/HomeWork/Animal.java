package Lesson22_ООП_Incapsulation_SuperProtected.HomeWork;

public class Animal {
    public Animal() {
        System.out.println("I am animal");
    }

    int eyes;

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    Pet() {
        System.out.println("I am pet");
        int eyes = 2;
    }

    String name;
    int tale = 1;
    int paw = 4;

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    Dog(String name) {
        this.name = name;
        System.out.println("I am Dog and my name is: " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {
    Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is: " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Butch");
        System.out.println("У собаки " + dog.paw + " лапы");

        Cat cat = new Cat("Kitty");
        cat.sleep();
    }
}
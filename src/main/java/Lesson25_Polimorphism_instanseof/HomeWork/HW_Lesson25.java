package Lesson25_Polimorphism_instanseof.HomeWork;

public class HW_Lesson25 {

    public static void main(String[] args) {

        Animal a1 = new Mechenosec("Mechenosec Artur");
        Animal a2 = new Pingvin("Pingvin Serjant");
        Animal a3 = new Lev("Lev Lion-Bonifacci");
        Fish f1 = new Mechenosec("Mechenosec Garik");
        Bird b1 = new Pingvin("Pingvin Oleg");
        Mammal m1 = new Lev("Lev Mufasa");
        Mechenosec me = new Mechenosec("Mechenosec Machete");
        Lev l1 = new Lev("Lev King");
        Pingvin p1 = new Pingvin("Pingvin Matros");
        Speakable s1 = new Lev("Lev Lion-Bonifacci");
        Speakable s2 = new Pingvin("Pingvin Serjant");

        Animal[] array1 = {a1, a2, a3, f1, b1, m1, me, l1, p1};
        for (Animal animal : array1) {
            if (animal instanceof Mechenosec) {
                Mechenosec mech = (Mechenosec) animal;
                System.out.println(animal.name);
                mech.eat();
                mech.swim();
                mech.sleep();
            } else if (animal instanceof Lev) {
                Lev lev = (Lev) animal;
                System.out.println(lev.name);
                lev.run();
                lev.speak();
                lev.eat();
                lev.sleep();
            } else if (animal instanceof Pingvin) {
                Pingvin pin = (Pingvin) animal;
                System.out.println(pin.name);
                pin.eat();
                pin.fly();
                pin.speak();
                pin.sleep();
            }
            System.out.println("================================================");
        }
        System.out.println();
        System.out.println();

        Speakable[] array2 = {s1, s2, b1, m1, l1, p1};
        for (Speakable speakable : array2) {
            if (speakable instanceof Mechenosec) {
                Mechenosec mech1 = (Mechenosec) speakable;
                System.out.println(mech1.name);
                mech1.eat();
                mech1.swim();
                mech1.sleep();
            } else if (speakable instanceof Lev) {
                Lev lev1 = (Lev) speakable;
                System.out.println(lev1.name);
                lev1.run();
                lev1.speak();
                lev1.eat();
                lev1.sleep();
            } else if (speakable instanceof Pingvin) {
                Pingvin pin1 = (Pingvin) speakable;
                System.out.println(pin1.name);
                pin1.eat();
                pin1.fly();
                pin1.speak();
                pin1.sleep();
            }
            System.out.println("*******************************************");
        }

    }
}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    String name;

    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    String name;

    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable {
    String name;

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {
    String name;

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }

    @Override
    void eat() {
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm");
    }
}

class Pingvin extends Bird {
    String name;

    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Pingvin luybit est ribu!");
    }

    @Override
    void sleep() {
        System.out.println("Pingvini spyat prizavshis drug k drugu!");
    }

    @Override
    void fly() {
        System.out.println("Pingvini ne ymeut letat!");
    }

    @Override
    public void speak() {
        System.out.println("Pingvini ne ymeut pet kak solovi");
    }
}

class Lev extends Mammal {
    String name;

    Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Lev, kak luboi xishnik lubit myaso!");
    }

    @Override
    void sleep() {
        System.out.println("Bolshuyu xhast dnya lev spit!");
    }

    @Override
    void run() {
        System.out.println("Lev eto ne samaya bolshaya koshka!");
    }
}







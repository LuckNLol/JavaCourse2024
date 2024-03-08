//package Lesson24_1_Abstract_Default_Static_methods_in_Interface.HomeWork;
//
//public class HomeWork {
//    public static void main(String[] args) {
//        Mechenosec mechenosec = new Mechenosec("Artur");
//        System.out.println("Имя меченосца: " + mechenosec.name);
//        mechenosec.eat();
//        mechenosec.swim();
//        mechenosec.sleep();
//        System.out.println();
//
//        Speakable speakable = new Pingvin("Sejant");
//        speakable.speak();
//        System.out.println();
//
//        Animal animal = new Lev("Lion-Bonifacci");
//        System.out.println(animal.name);
//        animal.eat();
//        animal.sleep();
//        System.out.println();
//
//        Mammal mammal = new Lev("Lion-Simba");
//        System.out.println(mammal.name);
//        mammal.run();
//        mammal.eat();
//        mammal.sleep();
//        mammal.speak();
//    }
//}
//
//
//abstract class Animal {
//    String name;
//
//    Animal(String name) {
//        this.name = name;
//    }
//
//    abstract void eat();
//
//    abstract void sleep();
//}
//
//abstract class Fish extends Animal {
//    String name;
//
//    Fish(String name) {
//        super(name);
//        this.name = name;
//    }
//
//    public void sleep() {
//        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
//    }
//
//    abstract void swim();
//}
//
//abstract class Bird extends Animal implements Speakable {
//    String name;
//
//    Bird(String name) {
//        super(name);
//        this.name = name;
//    }
//
//    abstract void fly();
//
//    @Override
//    public void speak() {
//        System.out.println(name + " sings");
//    }
//}
//
//abstract class Mammal extends Animal implements Speakable {
//    String name;
//
//    Mammal(String name) {
//        super(name);
//        this.name = name;
//    }
//
//    abstract void run();
//
//    @Override
//    public void speak() {
//        System.out.println(name + " sings");
//    }
//}
//
//interface Speakable {
//    default void speak() {
//        System.out.println("Somebody speaks");
//    }
//}
//
//class Mechenosec extends Fish {
//    String name;
//
//    Mechenosec(String name) {
//        super(name);
//        this.name = name;
//    }
//
//    @Override
//    void swim() {
//        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm");
//    }
//}
//
//class Pingvin extends Bird {
//    String name;
//
//    Pingvin(String name) {
//        super(name);
//        this.name = name;
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Pingvin luybit est ribu!");
//    }
//
//    @Override
//    void sleep() {
//        System.out.println("Pingvini spyat prizavshis drug k drugu!");
//    }
//
//    @Override
//    void fly() {
//        System.out.println("Pingvini ne ymeut letat!");
//    }
//
//    @Override
//    public void speak() {
//        System.out.println("Pingvini ne ymeut pet kak solovi");
//    }
//}
//
//class Lev extends Mammal {
//    String name;
//
//    Lev(String name) {
//        super(name);
//        this.name = name;
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Lev, kak luboi xishnik lubit myaso!");
//    }
//
//    @Override
//    void sleep() {
//        System.out.println("Bolshuyu xhast dnya lev spit!");
//    }
//
//    @Override
//    void run() {
//        System.out.println("Lev eto ne samaya bolshaya koshka!");
//    }
//}
//
//
//
//
//
//
//

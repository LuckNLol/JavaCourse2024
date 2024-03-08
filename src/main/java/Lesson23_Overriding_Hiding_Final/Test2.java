package Lesson23_Overriding_Hiding_Final;

public class Test2 {
    public static void main(String[] args) {
        Teacher1 t = new Teacher1();
        Employee1 e = new Employee1();
        t.eat();
        e.eat();

        Employee1 e1 = new Teacher1();
        e1.eat();

    }
}

class Eda{}
class Fruits extends Eda{}


class Employee1 {
    double salary = 100;
    String name = "Leonid";
    int age;
    int experience;

    Eda eat() {  // Супер класс
        System.out.println("Кушает работник");
        Eda e = new Eda();
        return e;
    }

    void sleep() {
        System.out.println("Спит");
    }
}

class Teacher1 extends Employee1 {
    int studentsQty;

    Fruits eat() { // Сабкласс суперкласса Eda
        System.out.println("Кушает учитель");
        Fruits f = new Fruits();
        return f; // вывод саб класса класса Еда
    }

    void teach() {
        System.out.println("Учит");
    }
}

//class A {
//    Employee1 objectCreation(){
//        return new Employee1();
//    }
//}
//
//class B extends A {
//    Teacher1 objectCreation() {
//        System.out.println("ok");
//        return new Teacher1();
//    }
//}
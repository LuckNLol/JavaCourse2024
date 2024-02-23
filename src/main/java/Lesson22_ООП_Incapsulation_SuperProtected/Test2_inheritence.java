package Lesson22_ООП_Incapsulation_SuperProtected;

// Пример работы НАСЛЕДОВАНИЯ
public class Test2_inheritence {

    void uvelichenieZarplaty(Employee emp) {
        emp.salary += 100;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 49;
        doc.experience = 20;
        doc.specializatin = "xirurg";
        doc.heel();
        doc.eat();
        doc.sleep();
    }
}

// Создать Parent класс с общими для всех классов полями и методами (подходит всем профессиям)
class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Кушает");
    }

    void sleep() {
        System.out.println("Спит");
    }

}


// Child классы наследуются от класса Employee и содержат методы характерные только для этих классов
class Doctor extends Employee {
    String specializatin;

    void heel() {
        System.out.println("Лечит");
    }
}

// Пример sub крассов класса Doctor
class Xirurg extends Doctor{
    String skalpel;
    void operacia() {}
}

class dantist extends Doctor{
    String borMachine;
    void protezirovanie() {}
}



class Teacher extends Employee {
    int studentsQty;

    void teach() {
        System.out.println("Учит");
    }
}

class Driver extends Employee {
    String carName;

    void drive() {
        System.out.println("Водит авто");
    }
}























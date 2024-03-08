package Lesson23_Overriding_Hiding_Final;

public class Test1 {

    // Object прародитель всех объектов в классе
    //public Object abc() {return new Doctor(); // можно указать любые объекты (в т.ч. массивы)}

    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee e = new Employee();

        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
//        emp1.heel(); // не м.б. вызвана

        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();

        Doctor d2 = new Xirurg();
        System.out.println(d2.age);
        System.out.println(d2.name);
        System.out.println(d2.experience);
        System.out.println(d2.salary);
        System.out.println(d2.specializatin);
        d2.sleep();
        d2.eat();
        d2.heel();
//        d2.operacia(); // не м.б. вызвана
//       d2.skalpel; // не м.б. вызвана

        Employee emp4 = new Xirurg();
        emp4.sleep();
        emp4.eat();
        System.out.println(emp4.age);
        System.out.println(emp4.name);
        System.out.println(emp4.experience);
        System.out.println(emp4.salary);
//        System.out.println(emp4.specializatin); // не м.б. вызвана
//        emp4.operacia(); // не м.б. вызвана
//        emp4.scalpel; // не м.б. вызвана
    }
}

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

class Doctor extends Employee {
    String specializatin;

    void heel() {
        System.out.println("Лечит");
    }
}

class Xirurg extends Doctor {
    String skalpel;

    void operacia() {
    }
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
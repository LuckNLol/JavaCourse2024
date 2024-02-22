package Lesson6_Overloading_this;

// Конструкторы называются так, как называется Класс, но все параметры разные!
/* Ниже представлена вложенность конструторов друг вдруга по типу матрёшки +
после this конструктор дописывается в ручную (не эффективный метод)  */


public class Employee {
// 3 Определить часть параметров Конструктора для работников предприятия
// 4 Как не переписывать одинаковый код внутри конструктора?
// 4.1 Вызвать конструктор с определенными значениями
    public Employee (int id2, String surname2, int age2) {
        this(surname2, age2);
        id = id2;
    // 2 переменные присваиваются из конструктора 3.1 и 1 переменная дописывается
    }

// 3.1 Определить параметры Конструктора для новых сотрудников (нет id, но известен возраст и фамилия)
    private Employee (String surname3, int age3) {
        surname = surname3;
        age = age3;
    }

// 3.2 Определить параметры Конструктора для новых сотрудников (нет id, но известен возраст и фамилия)
    Employee (int id4, String surname4, int age4, double salary4, String department4) {
        this(id4, surname4, age4);
        salary = salary4;
        department = department4;
        // 3 переменные присваиваются из конструктора 3 и 2 переменные дописываются
    }

    Employee (int id5, String surname5, int age5, int salary5, String department5) {
        this(id5, surname5, salary5);
        age = age5;
        department = department5;
    }


// 1
    int id; //1
    public String surname; //1
    int age;
    private double salary; // 1
    String department;


// HW7: 3 public метода, показывающие значения переменных int, surname, salary

    public int showData(int id) {
        System.out.println(id);
        return id;
    }

    public String showData(String surname) {
        System.out.println();
        return surname;
    }

    public double showData(double salary) {
        System.out.println(salary);
        return salary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(12, "Петров", 0, 450, "IT");
        System.out.println(emp1.id + " " + emp1.surname + " " + emp1.salary);
    }



}

/* 1 Создать Объект, на основании контсруктора, дефолтный Конструктор заменить на свои */
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(12, "Иванович", 38); // 3
        System.out.println(emp1.surname);


//        Employee emp2 = new Employee("Петров", 34); // 3.1
//        System.out.println(emp2.surname);

        Employee emp3 = new Employee(123, "Сидоров", 25, 150_000, "IT"); // 3.2
        System.out.println(emp3.surname + " " + emp3.department);
    }
}
package Lesson5_ObjectCreation_Constructor_MethodsCall.HomeWork5;

// Задать парамертры
public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

// Создать конструктор для Employee
    Employee(int id1, String surname1, int age1, double salary1, String department1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

// Метод увеличения ЗП в 2 раза. Параметры в () не передаются!
    double salaryDoubleIncrease() {
        double result = salary *= 2;
        return result;
    }
}

class EmployeeTest {

    public static void main(String[] args) {

// Создаём 2 Объекта Класса и передаём в него значения всех переменных
        Employee empl1 = new Employee(123,"Kuchka", 24, 45000, "Accounting");
        Employee empl2 = new Employee(450, "Goveshka", 45, 95000.50, "Sales");

        empl1.salaryDoubleIncrease();
        System.out.println("ЗП после удвоения у работника " + empl1.surname + ": " + empl1.salary);

        empl2.salaryDoubleIncrease();
        System.out.println("ЗП после удвоения у работника " + empl2.surname + ": " + empl2.salary);

    }
}
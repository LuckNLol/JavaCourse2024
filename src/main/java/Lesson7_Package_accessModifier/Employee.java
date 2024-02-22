package Lesson7_Package_accessModifier;

// HW7
public class Employee {
// Создать переменные
    int id;
    public String surname;
    private double salary;
    int age;
    String department;

// Создать 3 конструктора public, private, default:
    public Employee(int id2) {
        id = id2;
    }
    Employee(String surname2) {
        surname = surname2;
    }
    private Employee(double salary2) {
        salary = salary2;
    }

// Метод удвоения ЗП
    public void dvoinayaZP() {
        double result = salary * 2;
        System.out.println("Двойная зарплата = " + result);
    }


// Создать 3 public метода
    public void getId() {
        System.out.println("ID: " + id);
    }

    public void getSurname() {
        System.out.println("Surname: " + surname);
    }

    public void getSalary() {
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        // вызываем метод
        emp.dvoinayaZP(); // при public модификаторе, метод вызывается успешно
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(5);
        Employee emp2 = new Employee("Иванов");
        //Employee emp3 = new Employee(500.5);

        emp1.getId();
        emp1.getSurname();
        emp1.getSalary();

        emp2.getId();
        emp2.getSurname();
        emp2.getSalary();

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        //System.out.println(emp1.salary);

        System.out.println(emp2.id);
        System.out.println(emp2.surname);
        //System.out.println(emp2.salary);

    }
}


package Lesson11_PrimitiveReferenceDataTypes;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double multiplier(double a) {
        a = a * 2;
        return a;
    }

    public double multiplySalary(double salary) {
        salary *= 2;
        return salary;
    }

}

class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Ivan", 500.55);
        double d =  emp1.multiplier(emp1.salary);
        double d1 =  emp1.multiplySalary(emp1.salary);
        System.out.println(d);
        System.out.println("Увеличилась переменная 'a' " + emp1.salary);
        System.out.println("Увеличилась переменная 'salary' " + d1);

    }
}
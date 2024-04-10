package Lesson29_1_LambdaExpression.HomeWork_1;

import java.util.ArrayList;
import java.util.function.Predicate;

public class HW29_1 {
}

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee extends ArrayList<Employee> {
    void printEmployee(Employee emp) {
        System.out.println("Имя работника: " + emp.name + ", Отдел: " + emp.department + ", Зарплата: " + emp.salary);
    }

    void filtraciyaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> eP) {
        for (Employee emp : aL) {
            if (eP.test(emp)) {
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Иван", "Информационные технологии", 170);
        Employee emp2 = new Employee("Елена", "Бухгалтерия", 181);
        Employee emp3 = new Employee("Семён", "Снабжение", 185);
        Employee emp4 = new Employee("Евдакия", "Маркетинг", 150);
        Employee emp5 = new Employee("Афонасий", "Информационные технологии", 210);
        Employee emp6 = new Employee("Гриша", "Гараж", 600);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);

        TestEmployee te = new TestEmployee();
        System.out.println("Показать всех из департамента IT с ЗП больше 200:");
        te.filtraciyaRabotnikov(list, x -> x.department == "Информационные технологии" && x.salary > 200);
        System.out.println("==========================================================================");
        System.out.println("Показать имена работников, начинающихся на 'Е' и ЗП меньше 450:");
        te.filtraciyaRabotnikov(list, x -> x.name.startsWith("Е") && x.salary < 450);
        System.out.println("==========================================================================");
        System.out.println("Имя работника начинается на ту же буквку что и название его названием департамента:");
        for (Employee em : list) {
            if (em.name.charAt(0) == em.department.charAt(0)){
                System.out.println(em.name +" from " + em.department);
            }
        }
    }
}
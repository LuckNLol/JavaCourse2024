package Lesson7_1;

//import Lesson7_Package_accessModifier.Employee;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Lesson7_Package_accessModifier.Employee emp1 = new Lesson7_Package_accessModifier.Employee(5);
//        Lesson7_Package_accessModifier.Employee emp2 = new Lesson7_Package_accessModifier.Employee("Иванов");
//        Lesson7_Package_accessModifier.Employee emp3 = new Lesson7_Package_accessModifier.Employee(500.5);

        //System.out.println(emp1.id);
        System.out.println(emp1.surname);
       // System.out.println(emp1.salary);

        emp1.getId();
        emp1.getSurname();
        emp1.getSalary();
    }
}

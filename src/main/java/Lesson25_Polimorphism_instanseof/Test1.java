//package Lesson25_Polimorphism_instanseof;
//
//public class Test1 {
//    public static void main(String[] args) {
//        Employee emp1 = new Teacher();
//        Employee emp2 = new Driver();
//        Employee emp3 = new Doctor();
//        Help_able h = new Teacher();
//
//        Driver [] array1 = {new Driver(), new Driver(), new Driver()};
//        Employee [] array2 = {new Driver(), new Teacher(), new Doctor()};
//        Help_able [] array3 = {new Driver(), new Teacher()};
//
////        emp1.work();
////        emp2.work();
////        emp3.work();
//
//// Тоже самое, но через цикл
////        Employee [] array4 = {emp1, emp2, emp3};
////        for (Employee emp: array4) {
////            emp.work();
////        }
//        System.out.println(emp1 instanceof Employee);
//        System.out.println(emp1 instanceof Teacher);
//        System.out.println(emp1 instanceof Driver);
//        System.out.println(emp1 instanceof Help_able);
//
//
//
//    }
//}
//
//abstract class Employee {
//    void sleep() {
//        System.out.println("Employee sleeps");
//    }
//
//    abstract void work();
//}
//
//class Teacher extends Employee implements Help_able {
//    void work() {
//        System.out.println("Teacher works");
//    }
//
//    @Override
//    public void help() {
//        System.out.println("Teacher helps");
//    }
//}
//
//class Driver extends Employee implements Help_able {
//    void work() {
//        System.out.println("Driver works");
//    }
//
//    public void help() {
//        System.out.println("Driver helps");
//    }
//}
//
//class Doctor extends Employee {
//    void work() {
//        System.out.println("Doctor works");
//    }
//
//    public void help() {
//        System.out.println("Driver helps");
//    }
//}
//
//interface Help_able{
//    void help();
//}
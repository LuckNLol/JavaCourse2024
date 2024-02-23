package Lesson22_ООП_Incapsulation_SuperProtected;

public class Human2 {
//    public Human2 (String n) {
//        name = n;
//    }

    public String name = "Kolya";
    public static int salary = 150;
    public void work(){
        System.out.println("Работать");
    };
    public static void rest(){
        System.out.println("Отдыхать");
    };
}

class Student extends Human2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}
package Lesson22_ООП_Incapsulation_SuperProtected;

public class Test4 {
}

class Human3 {
    String name = "Kolya";
    String surname;

    Human3(String n) {
        this(n, null); // Перегрузка конструктора
    }

    Human3(String n, String s) {
        name = n;
        surname = s;
    }
}

class Student2 extends Human3 {
    Student2(){
        super("Petya");
    }
    public static void main(String[] args) {
        Student2 s = new Student2();


    }
}

package Lesson11_PrimitiveReferenceDataTypes;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
// Написать метод, меняющий ссылки на студенотов. Для этого вводится 1 дополнительный объект
    public static void swapStudent(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
        System.out.println(s2.name);
    }

    public static void changeName (Student s1) {
        s1.name = "Vasiliy";
    }

    public static void main(String[] args) {
        Student std1 = new Student("Ivan", 2, 4.8);
        Student std2 = new Student("Petr", 3, 3.8);
        swapStudent(std1, std2);

        changeName(std2);

        System.out.println(std1.name);
        System.out.println(std2.name);

    }
}

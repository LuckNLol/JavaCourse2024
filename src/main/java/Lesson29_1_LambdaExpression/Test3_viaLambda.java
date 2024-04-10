package Lesson29_1_LambdaExpression;

import java.util.ArrayList;

public class Test3_viaLambda {
}

class Student3 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student3(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo3 {
    void printStudent(Student3 st) {
        System.out.println("Имя студента: " + st.name + ", Пол: " + st.sex + ", Возраст: " + st.age +
                ", Курс: " + st.course + ", Средняя оценка: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student3> aL, StudentChecks sc) {
        for (Student3 s : aL) {
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    }

    interface StudentChecks {
        boolean test(Student3 s);
    }


    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<>();
        Student3 st1 = new Student3("Иван", 'm', 22, 3, 8.3);
        Student3 st2 = new Student3("Николай", 'm', 28, 2, 6.4);
        Student3 st3 = new Student3("Елена", 'f', 19, 1, 8.9);
        Student3 st4 = new Student3("Петр", 'm', 35, 4, 7);
        Student3 st5 = new Student3("Мария", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo3 si = new StudentInfo3();


        si.testStudents(list, (Student3 st) -> {return st.avgGrade > 8.5;}); // Полный вариант
        System.out.println("=================================");
        si.testStudents(list, st -> st.avgGrade < 9); // Короткий вариант
        System.out.println("=================================");
        si.testStudents(list, (Student3 st) -> {int z = 5; return st.age > 25;}); // Смешанный вариант
        System.out.println("=================================");
        si.testStudents(list, (Student3 st) -> {
            return st.age < 27;
        });
        System.out.println("=================================");
        si.testStudents(list, (Student3 st) -> {
            return st.sex == 'm';
        });
        System.out.println("=================================");
        si.testStudents(list, (Student3 st) -> {
            return st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f' ;
        });
    }
}
package Lesson29_1_LambdaExpression;

import java.util.ArrayList;
import java.util.function.*;

public class Test6_PredicateInterface {
}


class Student4 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student4(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo4 {
    void printStudent(Student4 st) {
        System.out.println("Имя студента: " + st.name + ", Пол: " + st.sex + ", Возраст: " + st.age +
                ", Курс: " + st.course + ", Средняя оценка: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student4> aL, Predicate<Student4> t) { // !!! используется готовый интерфейс Predicate и новый свой И. создавать не нужно
        for (Student4 s : aL) {
            if (t.test(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student4> list = new ArrayList<>();
        Student4 st1 = new Student4("Иван", 'm', 22, 3, 8.3);
        Student4 st2 = new Student4("Николай", 'm', 28, 2, 6.4);
        Student4 st3 = new Student4("Елена", 'f', 19, 1, 8.9);
        Student4 st4 = new Student4("Петр", 'm', 35, 4, 7);
        Student4 st5 = new Student4("Мария", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo4 si = new StudentInfo4();
        for(Student4 s: list){
            System.out.println(s.name);
        }
        System.out.println();

// Убрать студента, у которого имя заканчивается на "а"
        list.removeIf(x -> x.name.endsWith("а"));
        for(Student4 s: list){
            System.out.println(s.name);
        }

        System.out.println();
        si.testStudents(list, (Student4 st) -> {return st.avgGrade > 8.5;}); // Полный вариант
        System.out.println("=================================");
        si.testStudents(list, st -> st.avgGrade < 9); // Короткий вариант
        System.out.println("=================================");
        si.testStudents(list, (Student4 st) -> {int z = 5; return st.age > 25;}); // Смешанный вариант
        System.out.println("=================================");
        si.testStudents(list, (Student4 st) -> {
            return st.age < 27;
        });
        System.out.println("=================================");
        si.testStudents(list, (Student4 st) -> {
            return st.sex == 'm';
        });
        System.out.println("=================================");
        si.testStudents(list, (Student4 st) -> {
            return st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f' ;
        });
    }
}
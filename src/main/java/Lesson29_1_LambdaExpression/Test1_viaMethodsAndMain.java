package Lesson29_1_LambdaExpression;

import java.util.ArrayList;

// Параметры поиска задали в Методах, а значения в методе main
public class Test1_viaMethodsAndMain {

}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Имя студента: " + st.name + ", Пол: " + st.sex + ", Возраст: " + st.age +
                ", Курс: " + st.course + ", Средняя оценка: " + st.avgGrade);
    }

    void printStudentsOverGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) {
            if (s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentUnderGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) {
            if (s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentOverAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentUnderAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentBySex(ArrayList<Student> aL, char sex) {
        for (Student s : aL) {
            if (s.sex == sex) {
                printStudent(s);
            }
        }
    }

    void printStudentMixedConditions(ArrayList<Student> aL, double avgGrade, int age, char sex) {
        for (Student s : aL) {
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Иван", 'm', 22, 3, 8.3);
        Student st2 = new Student("Николай", 'm', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'f', 19, 1, 8.9);
        Student st4 = new Student("Петр", 'm', 35, 4, 7);
        Student st5 = new Student("Мария", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();
        si.printStudentsOverGrade(list, 8.5);
        System.out.println("===========================");
        si.printStudentUnderGrade(list, 9);
        System.out.println("===========================");
        si.printStudentOverAge(list, 26);
        System.out.println("===========================");
        si.printStudentUnderAge(list, 27);
        System.out.println("===========================");
        si.printStudentBySex(list, 'm');
        System.out.println("===========================");
        si.printStudentMixedConditions(list, 7.2, 23, 'f');
        System.out.println("===========================");
    }
}
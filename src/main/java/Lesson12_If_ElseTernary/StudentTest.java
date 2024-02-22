package Lesson12_If_ElseTernary;

import Lesson11_PrimitiveReferenceDataTypes.Student;

public class StudentTest {

    public static void compareStudent(Student std1, Student std2) {
        if(std1.name.equals(std2.name)  && std1.course == std2.course && std1.grade == std2.grade) {
            System.out.println("Это один и тот же студент");
        } else {
            System.out.println("Это разные студенты");
        }
    }

    public static void comparePartsStudent(Student std1, Student std2) {
        if (std1.name.equals(std2.name)) {
            if (std1.course == std2.course) {
                if(std1.grade == std2.grade) {
                    System.out.println("Все параметры студентов одинаковые");
                } else {
                    System.out.println("Равны имена и курсы, но разные оценки");
                }
            }else {
                System.out.println("Равны имена, но разные курсы");
            }
        } else {
            System.out.println("Имена различаются");
        }

    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 2, 5.5);
        Student st2 = new Student("Ivan", 2, 5.5);
        compareStudent(st1, st2);
        comparePartsStudent(st1, st2);

    }



}

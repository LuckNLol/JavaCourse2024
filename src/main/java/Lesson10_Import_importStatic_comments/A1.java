package Lesson10_Import_importStatic_comments;

import Lesson9_VariablesVisibilityLimit.*;
// По умолчанию импортируется пакет java.lang, в который входят классы String, System
import java.lang.*;

public class A1 {
    public static void main(String[] args) {

// Вывод переменной c и z из класса Student урока9. Для этого убедиться что переменные с модификатором public
        String st1 = new String("hello");
        Student st2 = new Student();
        System.out.println(st2.z);
        System.out.println(st2.c);
        System.out.println(Student.c);


    }
}

class B {
    Student st3 = new Student();
}
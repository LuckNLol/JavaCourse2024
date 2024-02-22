package Lesson10_Import_importStatic_comments;

// Импортировать класс Student из пакета HW в уроке 4
import Lesson4_ClassAndObject.HomeWork.*;
import static Lesson9_VariablesVisibilityLimit.Car.ab;
// или
import static Lesson9_VariablesVisibilityLimit.Car.*;


public class A3 {

    public static void main(String[] args) {
        Student st1 = new Student();

// Вывод статичной переменной из урока 9, класса Car
        System.out.println(ab);
        System.out.println(count);

    }
}

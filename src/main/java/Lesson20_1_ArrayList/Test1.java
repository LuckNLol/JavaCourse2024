package Lesson20_1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Privet");

        Car car1 = new Car();
        list.add(car1);

        Student st1 = new Student();
        list.add(st1);

        list.add(new StringBuilder("Ok"));

// Допустимые записи
        //ArrayList <String> list1 = new ArrayList <String> ();
        //ArrayList <String> list1 = new ArrayList ();
        ArrayList <String> list1 = new ArrayList <> (); // самый лучший вариант записи
        list1.add("poka");

// Допустимые записи
        ArrayList <StringBuilder> list2 = new ArrayList <> (30);
        list2.add(new StringBuilder("his"));

// таже самая запись, но с импортом List
        List <StringBuilder> list3 = new ArrayList ();
        list3.add(new StringBuilder("his"));
    }

}

class Car{}
class Student{}
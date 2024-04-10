package Lesson30_Generics;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Привет");
        String s = info1.getValue();
        System.out.println(info1);
        System.out.println(s);

        Info<Integer> info2 = new Info<>(172060);
        System.out.println(info2);
        Integer i = info2.getValue();
        System.out.println(i);
    }
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}

class Info<T> { //<T> какой-то тип данных
    private T value; // значение типа данных <T>

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{~|~}-> " + value + " <-{~|~}";
    }

    public T getValue(){
        return value;
    }
}

class Parent {
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}

class Child extends Parent{
    // Дженерик метод не получиться перезаписать
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}
package Lesson29_2_LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// SOME METHODS
public class Test2 {
    public static void main(String[] args) {
// Вывод списка
        List<String> list = List.of("Привет", "Пока", "Как дела?", "Нормально!");
//        for (String s : list) {
//            System.out.println(s);
//        }
// Альтернативный способ:
        list.forEach(s -> System.out.println(s));
        System.out.println("===========================");

// REMOVE
        ArrayList<Integer> al = new ArrayList<>();
        al.add(6);
        al.add(1);
        al.add(7);
        al.add(3);
        al.add(4);
        al.add(2);
        al.add(5);
        al.removeIf(element -> element % 3 == 0); // Удалить элементы нацело делящиеся на 3
        System.out.println(al);
// альтернативный способ
        Predicate<Integer> p = element -> element % 3 == 0;
        al.removeIf(p);
        System.out.println(al);
        System.out.println("===========================");

// SORT
        al.sort((x, y) -> -x.compareTo(y)); // -x.compareTo(y) для сортировки в обратном порядке
        System.out.println(al);
    }
}


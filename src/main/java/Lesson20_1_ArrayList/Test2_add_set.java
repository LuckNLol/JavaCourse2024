package Lesson20_1_ArrayList;

import java.util.ArrayList;

public class Test2_add_set {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Poka");
        list.add("Poka");
        list.add("Ok");
        list.add(0, "hello");
        list.add(4, "hi");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.get(3)); // получить элемент по индексу

        list.set(2, "!!!"); // установить иное значение индексу
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}

package Lesson20_1_ArrayList;

import java.util.ArrayList;

public class Test4_addAll_clear {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("ok");
        list1.add("privet");
        list1.add("poka");
        for (String s : list1) {
            System.out.print(s + " ");
        }

        System.out.println();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");

        list1.addAll(1, list2);
        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();
        list1.clear();
        for (String s : list1) {
            System.out.print(s + " ");
        }
    }
}
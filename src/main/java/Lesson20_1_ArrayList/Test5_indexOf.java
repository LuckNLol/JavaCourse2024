package Lesson20_1_ArrayList;

import java.util.ArrayList;

public class Test5_indexOf {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(new StringBuilder("Hello"));
        list1.add(new StringBuilder("ok"));
        list1.add(new StringBuilder("privet"));
        list1.add(new StringBuilder("poka"));
        for (StringBuilder s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list1.indexOf(2)); // на выходе -1

        ArrayList<String> list2 = new ArrayList<>();
        list2.add(new String("Hello"));
        list2.add(new String("ok"));
        list2.add(new String("privet"));
        list2.add(new String("poka"));
        for (String s : list2) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list2.indexOf(new String("privet")));
        System.out.println(list2.lastIndexOf(new String("poka")));
        System.out.println(list2.size());
        //list2.clear();
        System.out.println(list2.isEmpty());
        System.out.println(list2.contains("poka"));







    }
}

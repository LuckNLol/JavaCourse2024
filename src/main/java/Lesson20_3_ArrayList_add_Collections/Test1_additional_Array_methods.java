package Lesson20_3_ArrayList_add_Collections;

import java.util.ArrayList;
import java.util.List;

public class Test1_additional_Array_methods {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
//        System.out.println("al1 = " + al1 + " ");

//        ArrayList<String> al2 = new ArrayList<>();
//        al2.add("one");
//        al2.add("three");
//        al2.add("four");
//        al2.add("ten");
        //System.out.println("al2 = " + al2 + " ");

//        all.removeAll(al2);
//        System.out.println("al1 = " + al1 + " ");

//        al1.retainAll(al2);
//        System.out.println("al2 = " + al1 + " ");

//        boolean result = al1.containsAll(al2);
//        System.out.println(result);

//        List<String> sublist = al1.subList(1, 4); // view
//        System.out.println("sublist = " + sublist);
//        sublist.add("ten");
//        System.out.println("Add to sublist = " + sublist);
//        System.out.println("al1 = " + al1 + " ");

//        Object[] array = al1.toArray();

//        String[] array3 = al1.toArray(new String[10]);
//        for(String s: array3) {
//            System.out.print(s + " ");
//        }

        // Эти списки не могут быть изменены, не могут содержать null
        List<String> list = List.of("odin", "dva", "tri");
        System.out.println(list);

        List<String> list2 = List.copyOf(list);
        System.out.println(list2 + " ");
    }
}

package Lesson20_1_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Test10_Collections_sort {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList <String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        System.out.println(list1);

        ArrayList <String> list2 = new ArrayList<>();
        list2.add(s3);
        list2.add(s1);
        list2.add(s4);
        list2.add(s2);
        System.out.println(list1.equals(list2));

        Collections.sort(list1);
        System.out.println(list1);

    }
}

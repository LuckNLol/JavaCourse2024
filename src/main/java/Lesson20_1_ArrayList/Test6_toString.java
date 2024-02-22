package Lesson20_1_ArrayList;

import java.util.ArrayList;

public class Test6_toString {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(new StringBuilder("Hello"));
        list1.add(new StringBuilder("ok"));
        list1.add(new StringBuilder("privet"));
        list1.add(new StringBuilder("poka"));
        System.out.println(list1.toString());
    }
}

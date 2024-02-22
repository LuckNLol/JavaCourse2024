package Lesson20_1_ArrayList.HomeWork;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWork {

    public ArrayList<String> abc(String... str) {
        ArrayList<String> al = new ArrayList<>();
        for (String s : str) {
            if (!al.contains(s)) {
                al.add(s);
            }
        }
        Collections.sort(al);
        System.out.println(al);
        return al;
    }

    public static void main(String[] args) {
        HomeWork homeWork20 = new HomeWork();
        homeWork20.abc("hello", "string", "kak dela?", "hello!", "roap", "string", "gum", "ave", "mankind", "gum", "boom");
    }
}

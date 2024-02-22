package Lesson20_3_ArrayList_add_Collections;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList <String> al1 = new ArrayList();
        // al1.add(new Test2()); // это не тип String, a тип Object
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        for (Object o : al1) {
            System.out.println("Number = " + o + " and lenght = " + ((String) o).length());
        }
    }
}

package Lesson20_1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test11_Iterators {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        System.out.println(list1);

        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();

        ListIterator<String> it1 = list1.listIterator();
        while (it1.hasNext()) {
            it1.next();
            it1.remove();
        }

    }
}

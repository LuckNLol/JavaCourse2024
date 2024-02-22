package Lesson20_1_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test9_asList {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        StringBuilder [] array = {sb2, sb3, sb3, sb3};
        List <StringBuilder> list8 = Arrays.asList(array);
        System.out.print(list8 + " ");
        System.out.println();

        //array[0].append("!!!");
        array[0] = new StringBuilder("Bb??");
        System.out.println(list8);
    }
}

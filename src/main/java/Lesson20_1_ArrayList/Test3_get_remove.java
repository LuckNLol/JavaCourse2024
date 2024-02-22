package Lesson20_1_ArrayList;

import java.util.ArrayList;

public class Test3_get_remove {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
// add
        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
// delete 1
        System.out.println();
        list.remove(0);
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
// delete 2
//        System.out.println();
//        list.remove("ok!!!");
//        for (String s : list1) {
//            System.out.print(s + " ");
//        }
// delete 3
        System.out.println();
        list.remove(sb3);
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }

    }
}

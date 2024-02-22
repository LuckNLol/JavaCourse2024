package Lesson20_1_ArrayList;

import java.util.ArrayList;

public class Test8_to_Array {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        Object[] array1 = list1.toArray();
        for(Object o: array1) {
            System.out.print(o + " ");  // Возвращается массив Object
        }
        System.out.println();
        System.out.println(list1);

        StringBuilder[] array2 = list1.toArray(new StringBuilder[5]);
        for (StringBuilder sb: array2) {
            System.out.print(sb + " "); //Возвращается тип данных, который написан в параметрах
        }
    }
}

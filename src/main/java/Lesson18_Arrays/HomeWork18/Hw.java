package Lesson18_Arrays.HomeWork18;

import java.util.Arrays;

public class Hw {

    public static int[] sortirovka(int[] array) {
        int a;

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array1 = {7, 1, -3, 5, 10, -4, 15, 9, 4};
        sortirovka(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}

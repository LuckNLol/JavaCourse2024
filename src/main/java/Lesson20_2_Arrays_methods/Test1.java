package Lesson20_2_Arrays_methods;

import java.util.Arrays;

// compare - сравнивает
// mismatch - находит индекс первого расхождения массиовов
public class Test1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};

        char[] array3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] array5 = {'p', 'r', 'i', 'v', 'e', 't', 'o'};
        char[] array4 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};
        char[] array6 = null;

        System.out.println(Arrays.compare(array3, array6));
// Если первый массив меньше второго, в выводе будет (отрицательное) число, если больше (положительное), если равны (0)

        System.out.println(Arrays.mismatch(array1, array2));
    }
}

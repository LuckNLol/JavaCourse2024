package Lesson19_varargs_foreach;

public class Test6_array2 {
    public static void main(String[] args) {
        int[][] array = {{3, 8, 7}, {4, 5}, {9, 4, 4, 6, 8, 3}};
        for (int[] array2 : array) {
            for (int a : array2) {
                System.out.print(a + " ");
            }
            // Тоже самое что и for выше
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
        }
    }
}


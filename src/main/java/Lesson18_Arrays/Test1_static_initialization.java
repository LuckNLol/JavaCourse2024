package Lesson18_Arrays;

public class Test1_static_initialization {
    public static void main(String[] args) {

        // Декларация массива. Ссылается на null
        int[] array1;
        String[] array2;
        double[][] array3;
        int[][] array4;

        // Размещение в памяти. Дефолтное значение массивов, 0, null
        array1 = new int[8];
        array2 = new String[3];
        array3 = new double[4][2];
        array4 = new int[3][];

        // Статическая инициализация массива
        array2[0] = "priver";
        array2[1] = "poka";
        array2[2] = "ok";
        array2[3] = "k"; // выходит за границу

        array3[0][0] = 3.24;
        array3[2][1] = 3.24;




    }
}

package Lesson18_Arrays;

public class Test3_exeption {
    public static void main(String[] args) {

        //ArrayIndexOutOfBoundsException выход за границу массива по его индексу
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        //array[3] = 4;

        //NullPointerException массив ссылается еще на незаданные величины
        int[][] array2 = new int[3][];
        System.out.println(array2[0][1]);

    }
}

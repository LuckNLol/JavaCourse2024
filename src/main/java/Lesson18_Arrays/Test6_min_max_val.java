package Lesson18_Arrays;

public class Test6_min_max_val {
    // Создать метод, для вывода наибольшего и наименьшего значения массива
    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Миниальный элемент массива: " + min + "\n" +
                "Максимальный элемент массива: " + max);
    }

    public static void main(String[] args) {
        double [] array1 = {1.05, -3.14, 8.0, -1.15, 9.19, -3.0};
        maxMin(array1);
        maxMin(new double[]{2.3, 5.5, -12.7, 1.8, 6.0, 3.89});
    }
}

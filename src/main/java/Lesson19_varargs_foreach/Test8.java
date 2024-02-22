package Lesson19_varargs_foreach;

public class Test8 {
    public static void main(String[] args) {

        int array[] = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();

// С помощью foreach loop нельзя проводить динамическую инициализацию массива
        for (int b : array) {
            b = 10;
            System.out.print(b + " ");
        }
    }
}

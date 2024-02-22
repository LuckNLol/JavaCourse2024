package Lesson19_varargs_foreach;

public class Test10 {
    public static void main(String[] args) {

        int[] array1 = {3, 1, -5, 0};
        int[] array2 = {-9, 1, 5, 2};

        for (int i = 0; i < array1.length && i < array2.length; i++) {
            array1[i] = 12;
            array2[i] = 3;
        }

// В foreeach loop можно работать только с элементами одного массива
//        for (int a : array1, int b : array2) {
//        }

    }
}

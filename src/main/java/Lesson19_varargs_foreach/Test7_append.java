package Lesson19_varargs_foreach;


public class Test7_append {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Shalom");
        StringBuilder sb2 = new StringBuilder("Nihao");
        StringBuilder sb3 = new StringBuilder("Canichua");
        StringBuilder[] array2 = {sb1, sb2, sb3};

        int[] array = {0, 6, 4, 1};
        String[] array1 = {"Ok", "Hello", "bye"};
        for (int i = 0; i < array.length; i++) {
// изменить значение всех элементов в int массиве через for
            array[i] = 3;
            System.out.print(array[i] + " ");
        }
        System.out.println();

// изменить значение всех элементов в int массиве через foreach
        for (int a : array) {
            array[a] = 2;
            System.out.print(array[a] + " ");
        }
        System.out.println();

// изменить значение всех элементов в String массиве через foreach
        for (String s : array1) {
            s = new String("Now");
            System.out.print(s + " ");
        }
        System.out.println();

// изменить значение всех элементов в StringBuilder в массиве через foreach
        for (StringBuilder sb : array2) {
            sb = new StringBuilder("Odin");
            sb.append(" Java,");
            System.out.print(sb + " ");
        }

    }
}

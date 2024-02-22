package Lesson18_Arrays;

public class Test7 {
    public static void main(String[] args) {

        char[] array = {'p', 'r', 'i', 'v', 'e', 't'};
        String s = new String(array);
        System.out.println(s);
        System.out.println();

        StringBuilder sb1 = new StringBuilder("Hello");
        char[] array1 = {'p', 'r', 'i', 'v', 'e', 't'};
        sb1.append(array1, 2, 3);
        System.out.println(sb1);
        System.out.println();

        StringBuilder sb2 = new StringBuilder("Hello");
        char[] array2 = {'p', 'r', 'i', 'v', 'e', 't'};
        sb2.insert(1, array2, 2, 3);
        System.out.println(sb2);

    }
}

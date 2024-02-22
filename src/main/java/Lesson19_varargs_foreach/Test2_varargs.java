package Lesson19_varargs_foreach;

public class Test2_varargs {
    static void summa(String s, int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(s);
        System.out.println(summa);
    }

    // можно передать в параметре массив
    public void abc(int[]... array) {
    }

    public static void main(String[] args) {
        summa("Hello", 5, 2, 0, 10);
        summa("Allo", new int[]{5, 2, 100, 10});
    }
}

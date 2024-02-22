package Lesson3_MathLogOperations;

public class Test3 {
    public static void main(String[] args) {


        // Операторы: + - * / %-остаток от деления
        // ++a, --a(префикс) прибавить или отнять 1 к значению
        // a++, a-- (постфикс) 1 прибавить или отнять к значению
        // +=, -=, *=, /=
        //int x=1, y=2, z =3;
        // ! отрицание. != не равно
        // &&-и ||-или (прекращают выполнение операции, как только найдено одно удовлетворяющее значпение)
        // &-и |-или выполняют все операции до конца. Работают с числами и boolean значениями
        // ^-или возвращает true тогда и только, когда одна операнда ВСЕГО выражения true

        int x = 5;
        int y = 3;
        int y1 = 3;
        int y2 = 4;

        int z = x - y++;
        int z1 = x - ++y1;
//        System.out.println(z);
//        System.out.println(y);
//        System.out.println();
//
//        System.out.println(z1);
//        System.out.println(y);

        int m = 5; // m = m + 3 тоже что и a += 3

        boolean e = x < y | ++y1 == y2;
        //System.out.println(e);

        int g = 5;
        int v = 6;
        //System.out.println(g & v); // g и v переводятся из 2чной в 10ую систему

        boolean f1 = true;
        boolean f2 = false;
        boolean f3 = false;
        boolean f4 = false;
       // System.out.println(f1 ^ f2 ^ f3 ^ f4); // если будет 1 true или 1 false то все выражение будет TRUE


        // ДОМАШНЯЯ РАБОТА

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;

        System.out.println(result);

        int a = 5;
        int b = 8;

        System.out.println(a-- - --a + ++a + a++ + a);
        System.out.println(++b - b++ + ++b - --b);

    }


}

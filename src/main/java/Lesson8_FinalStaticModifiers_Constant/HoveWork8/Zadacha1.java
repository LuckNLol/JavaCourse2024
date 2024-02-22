package Lesson8_FinalStaticModifiers_Constant.HoveWork8;

/* Объекты для методов не создаются, потому что методы static */

public class Zadacha1 {

    static double umnozhenie(double x2, double y2, double z2) {
        double result = x2 * y2 * z2;
        System.out.println("Произведение чисел: " + result);
        return result;
    }

    static void delenie(double x3, double y3) {
        double result1 = x3 / y3;
        double result2 = x3 % y3;
        System.out.println("Частное чисел: " + result1 + " Остаток: " + result2);
    }

}

class Zadacha1Test {
    public static void main(String[] args) {
        Zadacha1.umnozhenie(2, 3, 4);
        Zadacha1.delenie(9, 2);

        Zadacha1.umnozhenie(2.5, 3.5, 4);
        Zadacha1.delenie(15, 4);
    }
}

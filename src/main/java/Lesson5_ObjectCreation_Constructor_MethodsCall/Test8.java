package Lesson5_ObjectCreation_Constructor_MethodsCall;

public class Test8 {

// Создание функции сложения 3х чисел
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

/* Создать метод нахождения ср.арифм трех чисел, вызвав метод summa.
   Вызов метода внутри метода */
    int sumAvg(int a1, int b1, int c1) {
        int result2 = summa(a1, b1, c1)/3;
        return result2;
    }


}

class Test8_1 {
    public static void main(String[] args) {

/* Создать объект Класса, которой принадлежит функция и вывести данные
* на печать  */

        Test8 test = new Test8();
        int summaTrexChisel = test.summa(4, 5, 10);
        System.out.println("Сумма: " + summaTrexChisel);
        // или
        System.out.println("Сумма: " + test.summa(14, 25, 10));

        System.out.println("Среднее арифметическое: " + test.sumAvg(5, 6, 4));
    }

}
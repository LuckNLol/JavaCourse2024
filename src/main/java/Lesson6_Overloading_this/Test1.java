package Lesson6_Overloading_this;

public class Test1 {

/* Пример: Запись метода для сложения 3х числе */

    int sum(int a, int b, int c) {
        return a + b + c;
    }
/* Пример метода поиска среднего арифметического, с использованием метода сложения 3х чисел */
    int avgArifme(int x, int y, int z) {
        return sum(x, y, z)/3;
    }

}

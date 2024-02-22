package Lesson14_for_break_continue;

public class Test2_conditions {
    public static void main(String[] args) {
// Использование булиевых операторов в условии
        for (int i = 1, j = 2, k = 10; i < 11 && i > -3; i++, j = j + 20, k = k + 0) { //можно объявить несколько переменных ОДНОГО типа
            //System.out.println(i);
            //System.out.println();
        }

        for(int i =5; i < 11; i++, abc(15)) {
            //System.out.println(i);
        }

// i можно не писать внутри update statement, цикл будет работать БЕСКОНЕЧНО до переполнения памяти
        for(int i =5; i < 11; ) {
            //System.out.println(i);
        }

// i можно не писать внутри condition statement
        for(int i =1; ; i++) {
            System.out.println(i);
        }

    }

// можно передать метод в update statement цикла for
    static void abc(int n) {
        //System.out.println(n);
    }

}

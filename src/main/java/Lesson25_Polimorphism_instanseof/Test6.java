package Lesson25_Polimorphism_instanseof;

public class Test6 {
}

class Test10 {
    int a = 5;

    void abc() {
        System.out.println("Ok1");
    }
}

class Test20 extends Test10 {
    int a = 10;

    void abc() {
        System.out.println("Ok2");
    }
}

class Test30 extends Test20 {
    int a = 15;
// Вызов из класса Test30 метод abc класса Test20
    void abc() {
        super.abc();
        System.out.println("Ok3");
    }

    public static void main(String[] args) {
        Test30 t = new Test30();
// Вызов из класса Test30 переменную a класса Test10
        System.out.println(((Test10)t).a);
        ((Test10)t).abc();
    }
}

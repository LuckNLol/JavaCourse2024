package Lesson26_equals_toString_WrapperClasses;

public class Test5_Initializer {
    Test5_Initializer() {
        System.out.println("Это конструктор1");
    }
    Test5_Initializer(int a) {
        this(); // вызов overloaded (конструктора 1, а затем уже конструктор2)
        System.out.println("Это конструктор2");
    }

    // Initializer блок
    {
        System.out.println("это init блок3");
    }

    {
        System.out.println("это init блок1");
    }

    static {
        System.out.println("это STATIC init блок 1"); // сработает только 1 раз (несмотря на то что объекта 2)
    }

    {
        System.out.println("это init блок2");
    }

    static {
        System.out.println("это STATIC init блок 2"); // сработает только 1 раз (несмотря на то что объекта 2)
    }


    public static void main(String[] args) {
        Test5_Initializer ti1 = new Test5_Initializer();
        Test5_Initializer ti2 = new Test5_Initializer(3);

    }
}

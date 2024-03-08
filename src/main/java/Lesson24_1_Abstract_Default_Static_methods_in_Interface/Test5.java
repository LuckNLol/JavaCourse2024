package Lesson24_1_Abstract_Default_Static_methods_in_Interface;

public class Test5 {
}

interface I2{
    default void abc(){System.out.println("это метод abc");}
    static void def(){System.out.println("это static метод");}
}

interface I3 extends I2{
    void abc();
}

abstract class R implements I2 {
    public static void main(String[] args) {
        //def(); // ОШИБКА: static метод не наследуется классом
        I2.def(); // Вызов через название интерфейса
    }
}

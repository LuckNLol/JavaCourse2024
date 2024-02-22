package Lesson5_ObjectCreation_Constructor_MethodsCall;

public class Auto_withParams {
    String color;
    String engine;

// КОНСТРУКТОР С ПАРАМЕТРАМИ
    Auto_withParams(String cvet, String motor) {
        color = cvet;
        engine = motor;
    }
}

class CarTest {
    public static void main(String[] args) {

        Auto_withParams auto1 = new Auto_withParams("yellow", "V6");
        System.out.println(auto1.color);
        System.out.println(auto1.engine);
    }
}

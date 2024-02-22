package Lesson5_ObjectCreation_Constructor_MethodsCall;

public class MethodToConstructor {

    void MethodToConstructor(String cvet, String motor) {
        color = cvet;
        engine = motor;
        System.out.println("Цвет: " + color + " " + "Двигатель: " + engine);
    }
    String color;
    String engine;
}


class CarTest3 {
    public static void main(String[] args) {

        MethodToConstructor auto1 = new MethodToConstructor();
        MethodToConstructor auto2 = new MethodToConstructor();
    }
}

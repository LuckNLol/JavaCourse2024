package Lesson5_ObjectCreation_Constructor_MethodsCall;

public class Auto_NoParams {
    String color;
    String engine;

    // КОНСТРУКТОР БЕЗ ПАРАМЕТРОВ с телом
//    Auto_NoParams() {
//        //System.out.println("Object is created");
//    }
}

class CarTest1 {
    public static void main(String[] args) {

        Auto_NoParams auto2 = new Auto_NoParams();
        System.out.println(auto2.color);
        System.out.println(auto2.engine);
    }
}


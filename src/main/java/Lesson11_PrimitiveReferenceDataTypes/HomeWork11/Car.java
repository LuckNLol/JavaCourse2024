package Lesson11_PrimitiveReferenceDataTypes.HomeWork11;

public class Car {

    String color;
    String engine;
    public int doorsQty;

    public Car(String color, String engine, int doorsQty) {
        this.color = color;
        this.engine = engine;
        this. doorsQty = doorsQty;
    }
}

class CarTest{

    void changeDoors(Car c, int doorsQty) {
        c.doorsQty = doorsQty;
        System.out.println("Дверей стало: " + doorsQty);
    }

     void changeColor(Car c1, Car c2) {
        Car c3 = c1;
        c1 = c2;
        c2 = c3;
        System.out.println(c1.color);
        System.out.println(c2.color);
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("Black", "v6", 2);
        Car car2 = new Car("Pink", "v8", 4);

        System.out.println("Примитивный тип данных");
        System.out.println("Дверей было: " + car1.doorsQty);

        ct.changeDoors(car1, 3);
        System.out.println("Дверей было: " + car2.doorsQty);

        ct.changeDoors(car2, 5);
        System.out.println();

        System.out.println("Референс тип данных");

        ct.changeColor(car1, car2);
        System.out.println("Цвет машины 1: " + car1.color);
        System.out.println("Цвет машины 2: " + car2.color);

    }
}
package Lesson16_Class_String;

public class Car {

    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public Car abc(String color) {
        Car c10 = new Car(color, "v4");
        return c10;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "v6");
        Car c2 = c.abc("black");
        System.out.println(c.color);

    }
}



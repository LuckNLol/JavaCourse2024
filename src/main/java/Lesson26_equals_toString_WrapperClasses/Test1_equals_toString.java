package Lesson26_equals_toString_WrapperClasses;

import java.util.ArrayList;

public class Test1_equals_toString {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "v4");
        Car car2 = new Car("Red", "v4");
        Car car3 = new Car("Black", "v8");

        ArrayList<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        Car car4 = new Car("Black", "v8");
        System.out.println(list.contains(car4));
        System.out.println(car1.equals(car2));

//toString
        System.out.println(car3);
        System.out.println(car2.toString());
        System.out.println(list);
    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car2 = (Car) obj;
            return (color.equals(car2.color) && engine.equals(car2.engine));

        } else {
            return false;
        }
    }

//toString
    public String toString() {
        return "Машина цвета " + color + " и с мотором " + engine;
    }


}


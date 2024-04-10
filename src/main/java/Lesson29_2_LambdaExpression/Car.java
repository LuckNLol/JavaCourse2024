package Lesson29_2_LambdaExpression;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

// CUSTOMER & SUPPLIER
public class Car {
    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "Our Car is " + model + ", color is " + color + " and engine " + engine;
    }
}

// Supplier создает объекты при помощи метода get(), (нужно создать 3 одинаковых автомобиля)
class TestCar {
    public static ArrayList<Car> createThreeCats(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    // Consumer потребляет объекты (нужно изменить автомобили после их вызова)
    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCats(() -> new Car("Nissan Tiida", "Blue", 1.6));
        System.out.println("ourCars " + ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("Updated car: ");
        });

// альтернативная запись
//    Consumer<Car> consumer = car -> {
//            car.color = "red";
//            car.engine = 2.4;
//            System.out.println("Updated car: ");
//        };
//        consumer.accept(ourCars.get(0));
//        System.out.println("ourCars " + ourCars);
    }
}


















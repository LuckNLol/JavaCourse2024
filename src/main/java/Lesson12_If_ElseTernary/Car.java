package Lesson12_If_ElseTernary;

public class Car {


    // Вложенный if
    int engine;
    int doorCount;

    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(4, 5);
        Car c2 = new Car(4, 5);

        if (c1.engine > c2.engine) {
            if (c1.doorCount > c2.doorCount) {
                System.out.println("Мощность мотора и количество дверей у первой машины больше");
            } else {
                System.out.println("Мощность мотора у первой машины больше, а дверей меньше");
            }
        } else {
            System.out.println("Мощность второй машины и количество дверей больше чем у первой");
        }
    }
}

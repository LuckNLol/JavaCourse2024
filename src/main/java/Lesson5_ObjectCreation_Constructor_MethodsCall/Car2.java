package Lesson5_ObjectCreation_Constructor_MethodsCall;

public class Car2 {
    String color;
    String engine;
    int speed;

/* Создать метод, который УВЕЛИЧИВАЕТ скорость на определенное количество */
    int up_speed(int increase) {
        speed += increase;
        return speed;
    }

/* Создать метод, который УМЕНЬШАЕТ скорость на определенное количество */
    int sown_speed(int decrease) {
        speed -= decrease;
        return speed;
    }

/* Метод показывающий характеристики авто и с какой скоростью сейчас едет
* Чтобы ничего не возвращалось используется метод void */

    void show_car_info() {
        System.out.println("Цвет: " + color + ";" + "\n" +
                "Мотор: " + engine + ";" + "\n" +
                "Скорость: " + speed + "км/ч.");
    }
}


class getCarInfo {
    public static void main(String[] args) {
        Car2 MyCar = new Car2();
        MyCar.color = "green";
        MyCar.engine = "V12";
        MyCar.speed = 20;
        MyCar.show_car_info();
        System.out.println("Разогнался до " + MyCar.up_speed(20) + "км/ч");
        System.out.println("Затем скинул " + MyCar.sown_speed(40) + "км/ч");


    }
}

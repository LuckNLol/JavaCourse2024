package Lesson4_ClassAndObject;

public class Car {

    String color = "red";
    String engine = "V6";
    String brand = new String("BMW");

}

class CarTest {
    public static void main(String[] args) {
// Объект car2 ссылается на те же данные, что и car1 (2 объект, 1 данные)         int a;
        int a;
        Car car1 = new Car();
        car1.color = "black";
        car1.engine = "V8";

        Car car2 = car1;
        Car car3;

        System.out.println("'Color': " + car1.color);
        System.out.println("Engine: " + car2.engine);
        System.out.println("Brand: " + car1.brand);
        System.out.println();

/* Пример, когда обект не имеет адреса переменной, поэтому обращение к нему
будет выполнено 1 раз  */

        System.out.println(new Car().color);
    }
}
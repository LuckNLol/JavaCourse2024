package Lesson8_FinalStaticModifiers_Constant;

public class Car {
    String color = "Blue";
    String engine = "V6";
}

class Human {
    String name = "Иван";
    final Car car = new Car(); // если объект Car будет final то в методе main его не изменить

    public static void main(String[] args) {
        Human human1 = new Human();
        //human1.car = new Car();
        //human1.car = new Car(); // если объект Car будет final то в методе main его не изменить
        human1.car.engine = "V12"; // если объект Car будет final менять параментры авто можно
        human1.car.color = "red";
    }

}

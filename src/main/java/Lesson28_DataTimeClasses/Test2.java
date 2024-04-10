package Lesson28_DataTimeClasses;

public class Test2 {
    Car с = Car.createCar();
}

class Car{
    private Car(){}
    static Car createCar(){
        return new Car();
    }
}
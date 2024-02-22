package Lesson9_VariablesVisibilityLimit;

import jdk.jshell.Snippet;

public class Car {

// Идентификаторы


    String color;
    public static int ab = 10;
    String engine;
    public static int count;

    public static void changeA(int b){
        Car с = new Car("red", "v6");
        с.ab = b;
    }

    public Car(String color, String engine) {
        this.count++;
        this.color = color; // this существует сам по себе. Можно не указывать. Пишем, чтобы не изменять название переменных
        this.engine = engine; // this существует сам по себе. Можно не указывать
    }

    public void showColor() {
        System.out.println("Цвет машины: " + color);
        this.changeColor("Purple"); // this существует сам по себе. Можно не указывать
    }

// Метод сообщает, что цвет машины изменился и цена увеличилась на 1К
    public void changeColor(String color2) {
        count++;
        String a = color2;
        System.out.println("Цвет машины изменился");
        int price = 5000;
        this.color = color2; // this существует сам по себе. Можно не указывать
        price += 1000;
        String b = color2;
    }
}

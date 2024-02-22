package Lesson5_ObjectCreation_Constructor_MethodsCall;

// 1. Создать конструктор для Авто
class Car4 {
    String color;
    String engine;
    Car4(String col, String eng) {
        color = col;
        engine = eng;
    }
}

// 2. Создать конструктор для Банковского счета
class BankAccount {
    int id;
    double balance;
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }
}

// 3. Создать конструктор для Human
public class Human {

    String name;
    Car4 car;
    BankAccount bA;
    void info() {
        System.out.println("Имя: " + name + "; " + "Цвет авто: " + car.color + "; " +
                "Баланс банковского счета: " + bA.balance);
    }
}

// 4. Вывести данные передав заполнив параменры
class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car4("red", "v8");
        h.bA = new BankAccount(2312, 125.50);
        h.info();
    }
}
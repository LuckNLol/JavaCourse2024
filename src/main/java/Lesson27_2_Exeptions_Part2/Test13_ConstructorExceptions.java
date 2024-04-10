package Lesson27_2_Exeptions_Part2;

import java.io.FileNotFoundException;

public class Test13_ConstructorExceptions {
    public static void main(String[] args) throws FileNotFoundException, Exception {
        Animal2 a2 = new Mouse2();
        Human h =new Human("Иван", 1);
        System.out.println("Имя: " + h.name + ", " + "Возраст: " + h.age);

    }
}

class Animal2 {
    Animal2() throws FileNotFoundException {
    }
}

class Mouse2 extends Animal2 {
    Mouse2() throws FileNotFoundException {
        super(); // Конструктор сабкласса, как минимум, должен бросать такой же Exception который есть в супер классе или шире (IOException)
    }
}

class Human {
    String name;
    int age;

    Human(String name, int age) throws Exception {
        if (age < 0) {
            throw new Exception("Возраст указан некорректно");
        }
        this.age = age;
        this.name = name;
    }
}
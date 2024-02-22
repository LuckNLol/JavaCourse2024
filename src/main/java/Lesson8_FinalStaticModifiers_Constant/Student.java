package Lesson8_FinalStaticModifiers_Constant;

public class Student {
// Создаем instance переменные со значениме static для переменной count
    String name; // по дефолту: null
    int course; // по дефолту: 0
    static int count; /* по дефолту: 0. Эта переменная Class variable (принадлежит всему классу)
                  добавив к ней модификатор "static" ее значение можно изменить в других классах  */

// При появлении нового студена count увеличивается на 1
    public Student(String name2, int course2) {
        count++; // данным способом не увеличить на 1 последующие значения, каждый раз все начнается 0+1
        name = name2;
        course = course2;
        System.out.println("Студент № " + count + " создан");
    }

// Добавление в методе значения static
    public static void showCount() {
        System.out.println("Всего создано студенотов: " + count);
    }

}

class StudentTest {
    public static void main(String[] args) {
// Создаем объект Студент, на базе конструктора
        Student std = new Student("Леонид", 2);
        Student std1 = new Student("Елена", 1);
        Student std2 = new Student("Пётр", 4);

// После назначения static для переменной count можно переписать вывод на печать
        System.out.println(std.name);
        System.out.println(Student.count); // Вывод ПЕРЕМЕННОЙ ссылаясь на Класс Student (т.к. вывод находится за пределами класса
        Student.showCount(); // Вывод МЕТОДА ссылаясь на Класс Student

    }
}

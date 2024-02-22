package Lesson17_StringBuilder;

class Car{}

public class Test1_methods {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(); // По умолчанию вместимость = 16 символов
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder(50); // Вместимость
        StringBuilder sb4 = new StringBuilder(sb2);
        StringBuilder sb5 = new StringBuilder("Hello World");
        StringBuilder sb6 = new StringBuilder("Всем привет");

        System.out.println(sb2.length()); // Показать длину
        String s = sb2.substring(5); // Показать подстроку с 5 символа
        System.out.println(s);
        String s1 = sb2.substring(5, 8); // Показать подстроку с 5 по 8 символы
        System.out.println(s1);
        System.out.println(sb2.subSequence(5, 9)); // Показать символы с 5 по 9 символы
        sb2.append(22);   // метод изменяющий объект StringBuilder
        sb2.append(true); // добаляет 22 и true
        System.out.println(sb2); // метод изменяющий объект StringBuilder
        sb2.append(new Car()); // добавить объект к Классу
        System.out.println(sb2);
        System.out.println(sb2.insert(4, "55")); // Вставить символы
        sb5.delete(4, 6); // Удалить символы с ... до
        System.out.println(sb5);
        sb5.deleteCharAt(6); // Удалить символ
        System.out.println(sb5);

        sb5.reverse(); // Перевернуть запись
        System.out.println(sb5);

        sb6.replace(0, 5, "Пете "); // Заменить строку
        System.out.println(sb6);
        System.out.println(sb6.capacity()); // Посмотреть вместимость.

    }
}

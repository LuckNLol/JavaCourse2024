package Lesson16_Class_String;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("privet");

//        String c1 = s1.substring(3); // Начиная с 3 индекса вывести подстроку строки s1
//        System.out.println(c1);
//
//        String c2 = s1.substring(3, 7); // Начиная с 3 до 7 индекса вывести подстроку строки s1
//        System.out.println(c2);
//
//        String c3 = s1.substring(3, 11); // Выводит все символы с 3 по 10 включительно
//        System.out.println(c3);
//
//        String c4 = s1.trim(); // Убирает пробелы слева и справа от текста, не трогая серидину
//        System.out.println(c4);
//
//        String c5 = s1.replace("i", "E"); // Изменяет символ
//        System.out.println(c5);
//
//        String c6 = s1.replace("vet", "yeett"); // Изменяет символы
//        System.out.println(c6);
//
//        String c7 = "privet ";
//        String c8 = "drug";
//        String c9 = c7.concat(c8); // Соединение строк
//        System.out.println(c9);

        String c10 = "Kak Dela?";
        String c11 = "kak dela?";
        System.out.println(c10.equals(c11));           // false из за больших и малых букв
        System.out.println(c10.equalsIgnoreCase(c11)); // true, игорирует заглавные буквы

    }
}

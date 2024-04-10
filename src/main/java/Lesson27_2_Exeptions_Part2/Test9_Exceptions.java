package Lesson27_2_Exeptions_Part2;

import java.util.ArrayList;

public class Test9_Exceptions {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {

//        list.add("1");
//        list.add("2");
//        System.out.println(list.get(3)); // IndexOutOfBoundsException

//        System.out.println(5/0); // ArithmeticException
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Teacher t3 = new Teacher();
//        Teacher [] array2 = {t, t3};
//        Employee [] array1 = {d, t};
//        Teacher t2 = (Teacher)array1[0]; // ClassCastException (Doctor cannot be cast to Teacher)
//        Doctor d2 = (Doctor)array2[0]; // Compile error
//        list.add("!!!"); // NumberFormatException
        Integer.parseInt("44op"); //NumberFormatException нельзя перевести String в Integer

//        createPsw("Makaroni"); // Можно вызвать IllegalArgumentException

    }

    public static void createPsw(String psw) {
        if (psw.length() < 6) {
            throw new IllegalArgumentException("Длина пароля меньше 6 символов");
        }
        if (psw.length() > 12) {
            throw new IllegalArgumentException("Длина пароля больше 12 символов");
        }
        System.out.println("Пароль принят");
    }
}

class Employee {
}

class Doctor extends Employee {
}

class Teacher extends Employee {
}

//class Samolet {
//    String sostoyanie = "В ожидании"; // "В ожидании", "В воздухе", "Полёт отменён"
//
//    public void letet() {
//        sostoyanie = "В воздухе";
//        System.out.println("Самолет летит");
//    }
//
//    public void ozhidat() {
//        if (sostoyanie.equals("В воздухе")) {
//            throw new IllegalStateException("Самолёт уже в воздухе");
//        }
//        sostoyanie = "В ожидании";
//        System.out.println("Самолет в ожидании полета");
//    }
//
//    public void otmenitPolet() {
//        if (sostoyanie.equals("В воздухе")) {
//            throw new IllegalStateException("Самолёт уже в воздухе");
//        }
//        sostoyanie = "Полёт отменен";
//        System.out.println("Полёт самолета отменен");
//    }
//
//    public static void main(String[] args) {
//        Samolet s = new Samolet();
//        s.ozhidat();
//        s.letet();
//        s.otmenitPolet(); // IllegalStateException, нельзя отменить полет, т.к. самолёт уже в полёте
//    }
//}

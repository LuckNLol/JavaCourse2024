package Lesson30_Generics;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(-210);
        al1.add(110);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Весь");
        al2.add("Мир");
        al2.add("Театр");

        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);
        String b = GenMethod.getSecondElement(al2);
        System.out.println(b);

    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){ // Пока не знаем какой тип данных будет в ArrayList(е), <T> - generic
        return al.get(1); // метод возвращает 2й элемент ArrayList(а)
    }
}
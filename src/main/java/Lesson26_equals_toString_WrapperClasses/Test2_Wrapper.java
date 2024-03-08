package Lesson26_equals_toString_WrapperClasses;

import java.util.ArrayList;

public class Test2_Wrapper {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        int a = list.get(0); // unboxing перевод объекта в примитивный тип данных
        System.out.println(a);

        Integer b = new Integer(10); // unboxing
        int c = b;
        System.out.println(c);

        Number b1 = new Integer(15);
        int c1 = (Integer) b1; // Casting

        long l = 50l;

// Parsing. Перевод из String в нужный примитивный тип данных
        String s1 = "50";
        String s2 = "true";
        String s3 = "3.14";

        int i1 = Integer.parseInt(s1);
        boolean a1 = Boolean.parseBoolean(s2);
        double d1 = Double.parseDouble(s3);

        System.out.println(i1);
        System.out.println(a1);
        System.out.println(d1);

// valueOf.
        Integer i2 = Integer.valueOf(10);
        System.out.println(i2*2);
        Double d2 = Double.valueOf(i1);
        System.out.println(d2);
        Byte b10 = new Byte((byte) 5); //int нельзя установить без кастинга в byte
        Byte b11 = Byte.valueOf((byte) 5); //int нельзя установить без кастинга в byte



    }
}

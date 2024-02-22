package Lesson2_PrimitiveDataTypes;

public class Test2 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b3 = 100;

        short a1 = 5;
        short a2 = -15;
        short a3 = 32767;

        long l1 = 1000;
        long l2 = 10000000000L; //L !!

        float f1 = 3.5F; //F !
        float f2 = 3.5f; //f !

        double d1 = 4.5; //D по желанию !!
        double d2 = 4.57;

        char c1 = 'a'; // символ только один.
        char c2 = 300; // покажет 300 значение в UNICODE 10 исчисление
        char c3 = '\u1234'; // 16 система исчисления

        int a4 = 60; // десятиричная
        int a5 = 0B111100; // двоичная (0B перед числом)
        int a6 = 074; // воьмиричная (0 перед числом)
        int a7 = 0x3C; // шестнадцатиричная

        int a8 = 1_000_000; // _ для удобства чтения кода

        //System.out.println(a8);


        // Домашнее задание
        byte i1 = 12; //10
        byte i2 = 0B1100; //2 ?
        byte i3 = 014; //8
        byte i4 = 0xC; //16

        short s1 = 1300; //10
        short s2 = 0B010100010100; //2
        short s3 = 02424; //8
        short s4 = 0x514; //16

        int u1 = 0; //10
        int u2 = 0B0; //2
        int u3 = 00; //8
        int u4 = 0x0; //16

        long lo1 = 123456789; //10
        long lo2 = 0B0111010110111100110100010101; //2
        long lo3 = 0726746425; //8
        long lo4 = 0x75BCD15; //16

        float fl1 = 1.2f;
        float fl2 = 2.2459f;
        double dl1 = 3.253;
        double dl2 =43.235541D;
        boolean x = true;
        boolean y = false;

        char h1 = 'c';
        char h2 = '@';
        char h3 = ' ';
        char h4 = 200;
        char h5 = '\u5040';



        System.out.println(fl1);


    }

}

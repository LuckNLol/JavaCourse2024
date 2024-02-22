package Lesson10_Import_importStatic_comments.HomeWork10.p4;

import Lesson10_Import_importStatic_comments.HomeWork10.p1.A;
import Lesson10_Import_importStatic_comments.HomeWork10.p2.B;
import Lesson10_Import_importStatic_comments.HomeWork10.p2.p3.C;
import Lesson10_Import_importStatic_comments.HomeWork10.p4.p5.E;
import static Lesson10_Import_importStatic_comments.HomeWork10.p2.B.*;

public class D {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Мы из пакета 'А': " + a.str + " && " + a.doo);

        C c = new C();
        System.out.println("А я из пакета 'С' " + c.bee + " соточка!");

        E e = new E();
        System.out.println("Оу еее, я из пакета 'Е', а это мой знак - " + e.di);

        B b = new B();
        b.showStatic();

    }
}

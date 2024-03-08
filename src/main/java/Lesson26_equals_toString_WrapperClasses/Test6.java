package Lesson26_equals_toString_WrapperClasses;

public class Test6 {
    int a = 3;

    Test6() {
        a = 4;
    }

    {
        a = 5;
    }

//    public static void main(String[] args) {
//        Test6 t = new Test6();
//        System.out.println(t.a);
//    }
}

class A {
    static final int b; // должна либо сразу быть объявлена, либо

    static {
        b = 10;
    } // через static initializer
}

class B {
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;

    static {
        c = 5; d = 4; f = 0;
    }
}

class С {
    String s = "ok";
    {
        System.out.println(s);
    }
    static int i = 0;
    static {
        System.out.println(i);
    }

    {
        i = i + 1;
        System.out.println(i);
    }
    С() {
        System.out.println("Это конструктор");
    }

    public static void main(String[] args) {
        System.out.println("Привет всем");
        С с = new С();
    }
}

class D {
    static {
        abc(2);
    }
    static void abc(int a) {
        System.out.println(a + " ");
    }

    D(){
        abc(5);
    }

    static {abc(4);}
    {abc(6);}
    static {new D();}
    {abc(8);}

    public static void main(String[] args) {

    }
}

package Lesson8_FinalStaticModifiers_Constant;

public class Test1 {

    public final int a ;
// дефолтный конструктор
    Test1() {
        a = 10;
    }
// конструктор с параметрами
    Test1(boolean b) {
        a = 15;
    }

    public void abc(final short s) {
        final byte b;
        b = 10;
//        s++; //ошибка
        System.out.println(s + b);
    }

    public static void main(String[] args) {

        Test1 t = new Test1();
        //t.a = t.a * 2;
        System.out.println(t.a);
    }
}

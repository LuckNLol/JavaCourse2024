package Lesson26_equals_toString_WrapperClasses;

public class Test3_methodPriority {

    void abc(int i) {
        System.out.println("int");
    }
    void abc(byte i) {
        System.out.println("byte");
    }
    void abc(long i) {
        System.out.println("long");
    }

    void def(Object o) {
        System.out.println("object");
    }
    void def(String o) {
        System.out.println("string");
    }

//    void ghi(int a, int b){
//        System.out.println("Hello1");
//    }
//    void ghi(long a, long b){
//        System.out.println("Hello2");
//    }
//    void ghi(Integer a, Integer b){
//        System.out.println("Hello3");
//    }
    void ghi(int ... a){
        System.out.println("Hello4");
    }

    public static void main(String[] args) {
        Test3_methodPriority t = new Test3_methodPriority();
        t.abc((byte)5);
        t.abc(5);
        System.out.println();

        t.def(new StringBuilder("Hello"));
        t.def("hello");
        System.out.println();

        t.ghi(1, 2);

    }

}

package Lesson21_garbage_collection;

public class Test3 {

    Test3 (){
        System.out.println("это конструктор");
    }
    void Test3 (){
        System.out.println("это метод");
    }
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}

package Lesson29_2_LambdaExpression;

import java.util.ArrayList;

// FUNCTIONAL INTERFACE
public class Test1 {
    public static void main(String[] args) {
        //TestInferenceType tit = new TestInferenceType(); // Длинная запись
        var tit = new TestInferenceType(); // Сокращенная запись
        var i = 10; // компилятор понимает что это тип данных int
        var w = 12.5;  // компилятор понимает что это тип данных double
        var array = new String [] {"a", "v"};
        var result = abc();
        Object obj1 = "privet";
        var obj2 = obj1;
        ArrayList <String> al = new ArrayList<>();
        for(var s: al){
            System.out.println(s);
        }

    }
     static double abc(){
        return 3.14;
    }
}

class TestInferenceType{}


interface I {
    void abc();
    default void def(){}
    default void def2(){}
    static void def3(){}

}

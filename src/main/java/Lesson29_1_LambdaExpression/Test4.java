package Lesson29_1_LambdaExpression;

public class Test4 {

    static void def(Test5 t){
        System.out.println(t.abc("Привет", "Медвед!"));
    }

    public static void main(String[] args) {
        def((x, y) -> y.length());
    }
}

interface Test5 {
    int abc(String s1, String s2);
}

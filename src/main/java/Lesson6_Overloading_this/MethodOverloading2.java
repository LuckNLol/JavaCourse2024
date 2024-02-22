package Lesson6_Overloading_this;

public class MethodOverloading2 {

    int sum(int i1, int i2) {
        return i1 + i2;
    }

    String sum(String s1, String s2) {
        return s1 + s2;
    }
}

class MethodOverloading2Test2 {
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();

        int a = mO2.sum(5, 7);
        System.out.println(a);

        String s = mO2.sum("Пить ", "воду");
        System.out.println(s);
    }


}
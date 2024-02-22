package Lesson6_Overloading_this.HomeWork6;

public class FiveOverloadMethods {

    int calculate() {
        return 0;
    }
    int calculate(int a) {
        return a;
    }

    int calculate(int b, int c) {
        return b + c;
    }
    int calculate(int d, int e, int f) {
        return d + e + f;
    }
    int calculate(int g, int k, int j, int h) {
        return g + k + j + h;
    }
}

class sumCalculate {
    public static void main(String[] args) {

        FiveOverloadMethods method1 = new FiveOverloadMethods();
        System.out.println(method1.calculate());

        FiveOverloadMethods method2 = new FiveOverloadMethods();
        System.out.println(method2.calculate(3));

        FiveOverloadMethods method3 = new FiveOverloadMethods();
        System.out.println(method3.calculate(2, 2));

        FiveOverloadMethods method4 = new FiveOverloadMethods();
        System.out.println(method4.calculate(3,4,6));

        FiveOverloadMethods method5 = new FiveOverloadMethods();
        System.out.println(method5.calculate(2, 4, 4, 6));

    }
}
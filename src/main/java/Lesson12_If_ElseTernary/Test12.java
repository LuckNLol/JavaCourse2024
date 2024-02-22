package Lesson12_If_ElseTernary;

public class Test12 {

    void maximim(int i1, int i2, int i3) {
        if(i1 > i2 && i1 > i3) {
            System.out.println("Max i1 = " + i1);
        } else if (i2 > i1 && i2 > i3)  {
            System.out.println("Max i2 = " + i2);
        }
        else {
            System.out.println("Max i3 = " + i3);
        }
    }

// Какое бы значение не принимала переменная а, она будет подходить для одного из if
    void abc() {
        String str;
        int a = 10;
        if (a >= 10) {
            str = "Привет";
        }
        if(a<10) {
            str = "Пока";
        }
        else {
            str = null;
        }
        System.out.println(str);
    }



    public static void main(String[] args) {
        Test12 tst = new Test12();
        tst.maximim(13, 5, 7);

// Тернарный оператор
        int a = 10;
        int b = 20;

        int max = (a > b)? a : b;
        System.out.println(max);

    }
}

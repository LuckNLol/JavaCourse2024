package Lesson17_StringBuilder;

public class Test3_equals {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb3 = sb1;
        StringBuilder sb2 = new StringBuilder("123");

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1 == sb3);
        System.out.println(sb1.equals(sb3));


    }
}

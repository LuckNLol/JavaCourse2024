package Lesson9_VariablesVisibilityLimit.HomeWork9;

public class Zadaniye1 {

    public static void abc() {
        String s1 = new String("ABC");
        String s2 = new String("DEF");

     }

    public static void main(String[] args) {
        Zadaniye1 z1 = new Zadaniye1();
        abc();
        abc();

        String s1 = new String("ABC");
        abc();
    }

}

package Lesson17_StringBuilder.HomeWork17;

public class Hw_var1 {


    public boolean ravenstvo(StringBuilder a, StringBuilder b) {
        boolean result = a.equals(b);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hi");
        StringBuilder sb2 = new StringBuilder("Hi");
        StringBuilder sb3 = sb2;
        Hw_var1 h1 = new Hw_var1();
        h1.ravenstvo(sb1, sb2);
        h1.ravenstvo(sb3, sb2);
    }



}



package Lesson17_StringBuilder.HomeWork17;

public class Hw_var2 {
    public static boolean ravenstvo(StringBuilder a, StringBuilder b) {
        boolean result = true;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;

    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hi");
        StringBuilder sb2 = new StringBuilder("Hi");
        StringBuilder sb3 = new StringBuilder("hi");
        StringBuilder sb4 = sb2;

        System.out.println(ravenstvo(sb1, sb2));
        System.out.println(ravenstvo(sb2, sb3));
        System.out.println(ravenstvo(new StringBuilder("!"), new StringBuilder(" ")));
        System.out.println(ravenstvo(sb4, sb2));
        System.out.println(ravenstvo(new StringBuilder(), new StringBuilder()));
    }


}


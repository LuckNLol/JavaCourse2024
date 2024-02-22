package Lesson16_Class_String;

public class Test4_methodChane {
    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "Uraaaa!!!";
        String s3 = s1.concat(s2).trim().replace("Uraaa", "УРА").substring(6, 10);
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}

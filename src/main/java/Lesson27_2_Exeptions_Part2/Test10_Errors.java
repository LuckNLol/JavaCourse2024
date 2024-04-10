package Lesson27_2_Exeptions_Part2;

public class Test10_Errors {

//    static {
//        int a = Integer.parseInt("12e"); // ExceptionInInitializerError в static методе
//    }

    //    static String s = null;
//    static int a = s.length(); // ExceptionInInitializerError в static методе

    static String s = abc();
    static String abc() {
        String[] array = {"1", "2", "3"};
        return array[100]; // ExceptionInInitializerError в static методе
    }

    public static void main(String[] args) {


    }

}


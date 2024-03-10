package Lesson27_Exeptions_Part1;

public class Test7_Error {
    static void abc() {
        System.out.println("работает метод abc");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc();
        }
        catch (StackOverflowError e) {
            System.out.println("Error пойман: " + e);
        }

    }
}

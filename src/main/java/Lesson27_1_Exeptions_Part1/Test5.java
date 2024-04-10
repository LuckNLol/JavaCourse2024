package Lesson27_1_Exeptions_Part1;

public class Test5 {
    void abc() throws NullPointerException {
        String s = null;
        System.out.println(s.length());
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        try{
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы вышли за пределы массива");
        }
    }
}


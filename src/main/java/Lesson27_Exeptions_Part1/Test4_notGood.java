package Lesson27_Exeptions_Part1;

public class Test4_notGood {
    public static void main(String[] args) {
        int[] array = {2, 4, 5};
        System.out.println("У нас есть массив");

        try {
            System.out.println(array[5]);
            System.out.println("Всем хорошего дня");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Был пойман exception " + e);
        }
        finally {
            System.out.println("Это блок finally");
        }

        System.out.println("Данный код не имеет отношение к исключениям, т.к. он за рамками try/catch блоков");
    }
}

package Lesson27_2_Exeptions_Part2;

public class Test5 {
    void abc() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e) {

            String s = null;
            try {
                System.out.println(s.length());
            } catch (NullPointerException e1) {
                System.out.println("Это внутренний catch блок");
            }
        } catch (NullPointerException e) {
            System.out.println("Пойман NullPointerException");
        }
    }
    // оба catch блока предназначены ловить исключения для try блока

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.abc();
    }
}

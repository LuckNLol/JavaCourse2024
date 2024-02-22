package Lesson14_for_break_continue;

// Использование break
public class Test5_break_continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println();

//Использование continue (чтобы пропустить значение при прохождении цикла)
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7) {
                continue;
            }
            if (i % 3 == 0) {
                break;
            }

            System.out.println(i);
        }


    }
}

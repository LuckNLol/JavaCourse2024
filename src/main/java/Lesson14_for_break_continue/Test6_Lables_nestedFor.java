package Lesson14_for_break_continue;

// Nested loop
public class Test6_Lables_nestedFor {
    // Вывести на экран каждую минуты времени
    public void time() {
        OUTER:
        for (int hour = 0; hour <= 23; hour++) {
            System.out.println("Начало outer loop");
            INNER:
            for (int min = 0; min <= 59; min++) {
                /* Как сделать так, чтобы задать условие break внутреннего цикла для внешнего цикла?
                 * Нужно назвать внешний цикл, и искользовать его название после break */
                if (min == 10) {
                    continue OUTER;
                    //break OUTER; // схема работает для внутренного цикла
                }

                System.out.println(hour + ":" + min);
            }
        }
        System.out.println("Конец outer loop");
    }


    public static void main(String[] args) {
        Test6_Lables_nestedFor t6 = new Test6_Lables_nestedFor();
        t6.time();
    }

}

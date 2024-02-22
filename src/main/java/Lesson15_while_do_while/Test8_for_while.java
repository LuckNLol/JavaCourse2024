package Lesson15_while_do_while;

public class Test8_for_while {
    public static void main(String[] args) {

        OUTER:
        for (int hour = 0; hour < 24; hour++) {
            int min = 0;
            INNER:
            while (min < 60) {
                System.out.println(hour + ":" + min);
                min++;
            }
        }
    }
}

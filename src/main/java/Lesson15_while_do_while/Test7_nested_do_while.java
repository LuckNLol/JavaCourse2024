package Lesson15_while_do_while;

public class Test7_nested_do_while {
    public static void main(String[] args) {
        int hour = 0;

        OUTER:
        do {
            int min = 0;
            INNER:
            while (min < 60) {
                if(min==20){
                    continue OUTER;
                }
                System.out.println(hour + ":" + min);
                min++;
            }
            hour++;
        }
        while (hour < 24);
    }
}

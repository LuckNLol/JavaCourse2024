package Lesson15_while_do_while.HomeWork15;

public class HW {
    public static void main(String[] args) {
        HW hw = new HW();
        hw.time();
    }

    public void time() {

        int hour = 0;
        OUTER:
        while (hour < 6) {
            int min = 0;

            MIDDLE:
            do {
                min++;
                if (hour > 1 && min % 10 == 0) {
                    break OUTER;
                }

                int sec = 0;
                INNER:
                while (sec <= 59) {
                    if ((sec * hour) > min) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                    sec++;
                }
            } while (min < 59);
            hour++;
        }
    }
}


package Lesson14_for_break_continue.HomeWork14;

public class HW {

    public void time() {
        OUTER:
        for (int hour = 0; hour <= 6; hour++) {
            MIDDLE:
            for (int min = 0; min <= 59; min++) {
                if (hour > 1 && min % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int sec = 0; sec <= 59; sec++) {
                    if ((sec * hour) > min) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                }

            }

        }

    }


    public static void main(String[] args) {
        HW hw = new HW();
        hw.time();
    }

}

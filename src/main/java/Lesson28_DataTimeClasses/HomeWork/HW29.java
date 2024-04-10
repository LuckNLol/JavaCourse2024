package Lesson28_DataTimeClasses.HomeWork;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HW29 {
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("YYYY, MMMM-MM !! hh:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");

    void smena(LocalDateTime start, LocalDateTime finish, Period p, Duration d) {
        LocalDateTime ldt = start;
        while (ldt.isBefore(finish)) {
            System.out.println("Работаем с: " + ldt.format(f1));
            ldt = ldt.plus(p);
            System.out.println("До: " + ldt.format(f1));
            System.out.println("Отдыхаем с: " + ldt.format(f2));
            ldt = ldt.plus(d);
            System.out.println("До: " + ldt.format(f2));
        }
    }

    public static void main(String[] args) {
        HW29 hw = new HW29();
        LocalDateTime ldt1 = LocalDateTime.of(2016, 1, 1, 9, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 2, 3, 9, 0);
        Period p = Period.of(0,1,2);
        Duration d = Duration.ofMinutes(60);

        hw.smena(ldt1, ldt2, p, d);

    }
}

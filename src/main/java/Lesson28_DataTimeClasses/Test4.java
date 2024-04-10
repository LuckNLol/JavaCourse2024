package Lesson28_DataTimeClasses;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test4 {
    static void smenaDezurnogo(LocalDate nachalo, LocalDate konec, Period p) {
        LocalDate data = nachalo;
        while (data.isBefore(konec)) {
            System.out.println("Наступила дата " + data + ". Пора менять дежурного");
            //data = data.plusMonths(1);
            data = data.plus(p); // удобнее задавтаь период
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2023, Month.MARCH, 1);
        LocalDate konec = LocalDate.of(2036, Month.MAY, 31);
        //Period p = Period.ofMonths(1); // Вар1.
        //Period p = Period.ofWeeks(2); // Вар.2
        //Period p = Period.ofDays(20); // Вар.3
        Period p = Period.of(1, 3, 15); // Вар.4

        smenaDezurnogo(nachalo, konec, p);
    }
}

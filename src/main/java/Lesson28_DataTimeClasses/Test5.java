package Lesson28_DataTimeClasses;

import java.time.*;

public class Test5 {

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2023, Month.MARCH, 1);
        //Period p = Period.ofMonths(3).ofDays(20); // Цепочка методов (chaining) сработает только метод Days!
        LocalTime lt = LocalTime.of(3,15,34);
        Period p = Period.ofMonths(3);
        p = p.plusDays(20);
        System.out.println(nachalo.plus(p));

        Duration d = Duration.ofHours(3); // Duration
        System.out.println(lt.plus(d));

    }
}


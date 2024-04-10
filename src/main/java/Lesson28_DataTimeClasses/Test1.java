package Lesson28_DataTimeClasses;

import java.time.*;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println();

        LocalDate ld1 = LocalDate.of(2024,03,17);
        System.out.println(ld1);
        ld1 = ld1.plusDays(20);
        System.out.println(ld1);

//        LocalDate ld2 = LocalDate.of(2024,Month.MARCH,17);
//        System.out.println(ld2);
        System.out.println();

        LocalTime lt1 = LocalTime.of(14,26);
        System.out.println(lt1);


//        LocalTime lt2 = LocalTime.of(14,26, 45);
//        System.out.println(lt2);
//        LocalTime lt3 = LocalTime.of(14,26, 54, 99999);
//        System.out.println(lt3);
        System.out.println();

        LocalDateTime ldt1 = LocalDateTime.of(2024,9,10,17,24, 23, 49504);
        System.out.println(ldt1);
        ldt1 = ldt1.plusYears(3).minusMonths(2).plusMinutes(20).minusSeconds(23);
        System.out.println(ldt1);
//        LocalDateTime ldt2 = LocalDateTime.of(2024,Month.MARCH,10,17,24, 23, 49504);
//        System.out.println(ldt2);
//        LocalDateTime ldt3 = LocalDateTime.of(ld1, lt1);
//        System.out.println(ldt3);
    }

}

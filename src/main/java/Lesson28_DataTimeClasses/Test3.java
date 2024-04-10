package Lesson28_DataTimeClasses;

import java.time.*;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2024, 6, 20);
        LocalDate ld2 = LocalDate.of(2024, 6, 19);
        System.out.println(ld1.isAfter(ld2));

        LocalTime lt1 = LocalTime.of(14, 26);
        LocalTime lt2 = LocalTime.of(3, 54, 23, 999);
        System.out.println(lt1.isBefore(lt2));

        LocalDateTime ldt1 = LocalDateTime.of(2024, 9, 10, 17, 24);
        LocalDateTime ldt2 = LocalDateTime.of(2024, 9, 10, 17, 24, 23);

    }
}

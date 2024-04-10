package Lesson28_DataTimeClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.*;

public class Test6 {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.of(2004, Month.MARCH, 27);
        LocalDateTime ldt = LocalDateTime.of(2024, Month.MARCH, 1, 16, 40);
//        LocalTime lt = LocalTime.of(13, 38, 12);
//        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
//        LocalDate date1 = LocalDate.parse("01 02 2015", f);
//        System.out.println(date1);
//        LocalDate date2 = LocalDate.parse("2015-02-01");
//        System.out.println(date2);




// Создать свой формат
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM, ww, yyyy, hh:mm");
        System.out.println(ldt);
        System.out.println(ldt.format(f));

//        System.out.println(ldt.getDayOfWeek());
//        System.out.println((ldt.getDayOfYear()));
//        System.out.println();
//
//        LocalTime lt2 = LocalTime.of(16, 54, 32);
//        System.out.println(lt2.getHour());
//        System.out.println();
//
//        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
//        System.out.println(ld.format(d1)); // Форматируется объект ld при помощи формата d1
//
//        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
//        System.out.println(lt.format(d2));
//
//        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        System.out.println(ldt.format(d3));
//        System.out.println();
//
//        DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;
//        System.out.println(ld);
//        System.out.println(ld.format(d4));
//        System.out.println();
//
//        DateTimeFormatter short_format = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL); // SHORT, MEDIUM
//        System.out.println(ld);
//        System.out.println(ld.format(short_format));
    }
}



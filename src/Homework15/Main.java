package Homework15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *  Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
 *  Пример: “JANUARY 1 2000” => true  “JANUARY 2 2020” => false
 */

public class Main {
    public static void main(String[] args) throws ParseException {

        String date1 = "JANUARY 1 2000";
        String date2 = "JANUARY 2 2020";
        String date3 = "JANUARY 2 2011";

        System.out.println(date1 + " " + isDateOdd(date1));
        System.out.println(date2 + " " + isDateOdd(date2));
        System.out.println(date3 + " " + isDateOdd(date3));

    }

    private static boolean isDateOdd(String date) {
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy",Locale.ENGLISH);
        long daysPassed;
        try {
            daysPassed = ChronoUnit.DAYS.between(formatter.parse(date).toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now());
            System.out.println(daysPassed + " daysPassed");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return daysPassed % 2 != 0;
    }

}

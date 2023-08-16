package Homework_3;

import java.time.LocalDate;

public class Task3_2 {
    //Напишите программу расчета даты следующего дня введя 3 числа - день месяц и год
    //     Пример:
    //     15
    //     3
    //     2000
    //     16 3 2000
    public static void main(String[] args) {

        int inputDay = 29;
        int inputMonth = 2;
        int inputYear = -2400;
        int daysInCurrentMonth = 0;
        boolean leapYear;

        System.out.println(inputDay + " " + inputMonth + " " + inputYear);

        if (inputYear % 4 == 0) {
            leapYear = true;
            if (inputYear % 100 == 0 && inputYear % 400 != 0) {
                leapYear = false;
            }
        } else {
            leapYear = false;
        }

        switch (inputMonth) {
            case 1 -> daysInCurrentMonth = 31;
            case 2 -> {
                if (leapYear == true) {
                    daysInCurrentMonth = 29;
                } else {
                    daysInCurrentMonth = 28;
                }
            }
            case 3 -> daysInCurrentMonth = 31;
            case 4 -> daysInCurrentMonth = 30;
            case 5 -> daysInCurrentMonth = 31;
            case 6 -> daysInCurrentMonth = 30;
            case 7 -> daysInCurrentMonth = 31;
            case 8 -> daysInCurrentMonth = 31;
            case 9 -> daysInCurrentMonth = 30;
            case 10 -> daysInCurrentMonth = 31;
            case 11 -> daysInCurrentMonth = 30;
            case 12 -> daysInCurrentMonth = 31;
        }

        inputDay++;
        if (inputDay > daysInCurrentMonth) {
            inputDay = 1;
            inputMonth++;
        }
        if (inputMonth > 12) {
            inputMonth = 1;
            inputYear++;
        }

        System.out.println(inputDay + " " + inputMonth + " " + inputYear);
    }
}

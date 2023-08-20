package Homework_3;


public class Task3_2 {
    //Напишите программу расчета даты следующего дня введя 3 числа - день месяц и год
    //     Пример:
    //     15
    //     3
    //     2000
    //     16 3 2000
    public static void main(String[] args) {

        int inputDay = 30;
        int inputMonth = 12;
        int inputYear = 2100;
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
            case 1, 3, 5, 7, 8, 10, 12 -> daysInCurrentMonth = 31;
            case 4, 6, 9, 11 -> daysInCurrentMonth = 30;
            case 2 -> {
                if (leapYear) {
                    daysInCurrentMonth = 29;
                } else {
                    daysInCurrentMonth = 28;
                }
            }
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

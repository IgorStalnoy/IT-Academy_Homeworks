package Homework_3;

public class Task3_1 {
    //Напишите программу, которая будет переводить секунды в форматированный вид - часы минуты секунды учитывая окончания слов
    //     Пример:
    //     1249
    //     20 минут 49 секунд
    //     648958
    //     180 часов 15 минут 58 секунд
    //Добавьте 3 строчку, которая будет выводить недели, сутки, часы минуты и секунды
    public static void main(String[] args) {


        int seconds = (int) (Math.random() * 2_147_483_647) + 1;
        int year, weeks, day, hour, minute;
        String yearOutput, weeksOutput, dayOutput, hourOutput, minuteOutput, secondsOutput;
        String yearNullCase, weeksNullCase, dayNullCase, hourNullCase, minuteNullCase, secondsNullCase;

        System.out.println(seconds + " секунд");

        year = seconds / 31_536_000;
        seconds = seconds % 31_536_000;
        weeks = seconds / 604_800;
        seconds = seconds % 604_800;
        day = seconds / 86400;
        seconds = seconds % 86400;
        hour = seconds / 3600;
        seconds = seconds % 3600;
        minute = seconds / 60;
        seconds = seconds % 60;


        if (year == 0) {
            yearOutput = "";
            yearNullCase = "";
        } else if (year >= 5 && year <= 20) {
            yearOutput = " лет ";
            yearNullCase = Integer.toString(year);
        } else if (year % 10 == 1) {
            yearOutput = " год ";
            yearNullCase = Integer.toString(year);
        } else if (year % 10 >= 2 && year % 10 <= 4) {
            yearOutput = " года ";
            yearNullCase = Integer.toString(year);
        } else {
            yearOutput = " лет ";
            yearNullCase = Integer.toString(year);
        }

        if (weeks == 0) {
            weeksOutput = "";
            weeksNullCase = "";
        } else if (weeks >= 5 && weeks <= 20) {
            weeksOutput = " недель ";
            weeksNullCase = Integer.toString(weeks);
        } else if (weeks % 10 == 1) {
            weeksOutput = " неделя ";
            weeksNullCase = Integer.toString(weeks);
        } else if (weeks % 10 >= 2 && weeks % 10 <= 4) {
            weeksOutput = " недели ";
            weeksNullCase = Integer.toString(weeks);
        } else {
            weeksOutput = " недель ";
            weeksNullCase = Integer.toString(weeks);
        }


        if (day == 0) {
            dayOutput = "";
            dayNullCase = "";
        } else if (day >= 5 && day <= 20) {
            dayOutput = " дней ";
            dayNullCase = Integer.toString(day);
        } else if (day % 10 == 1) {
            dayOutput = " день ";
            dayNullCase = Integer.toString(day);
        } else if (day % 10 >= 2 && day % 10 <= 4) {
            dayOutput = " дня ";
            dayNullCase = Integer.toString(day);
        } else {
            dayOutput = " дней ";
            dayNullCase = Integer.toString(day);
        }


        if (hour == 0) {
            hourOutput = "";
            hourNullCase = "";
        } else if (hour >= 5 && hour <= 20) {
            hourOutput = " часов ";
            hourNullCase = Integer.toString(hour);
        } else if (hour % 10 == 1) {
            hourOutput = " час ";
            hourNullCase = Integer.toString(hour);
        } else if (hour % 10 >= 2 && hour % 10 <= 4) {
            hourOutput = " часа ";
            hourNullCase = Integer.toString(hour);
        } else {
            hourOutput = " часов ";
            hourNullCase = Integer.toString(hour);
        }


        if (minute == 0) {
            minuteOutput = "";
            minuteNullCase = "";
        } else if (minute >= 5 && minute <= 20) {
            minuteOutput = " минут ";
            minuteNullCase = Integer.toString(minute);
        } else if (minute % 10 == 1) {
            minuteOutput = " минута ";
            minuteNullCase = Integer.toString(minute);
        } else if (minute % 10 >= 2 && minute % 10 <= 4) {
            minuteOutput = " минуты ";
            minuteNullCase = Integer.toString(minute);
        } else {
            minuteOutput = " минут ";
            minuteNullCase = Integer.toString(minute);
        }


        if (seconds == 0) {
            secondsOutput = "";
            secondsNullCase = "";
        } else if (seconds >= 5 && seconds <= 20) {
            secondsOutput = " секунд ";
            secondsNullCase = Integer.toString(seconds);
        } else if (seconds % 10 == 1) {
            secondsOutput = " секунда ";
            secondsNullCase = Integer.toString(seconds);
        } else if (seconds % 10 >= 2 && seconds % 10 <= 4) {
            secondsOutput = " секунды ";
            secondsNullCase = Integer.toString(seconds);
        } else {
            secondsOutput = " секунд ";
            secondsNullCase = Integer.toString(seconds);
        }

        System.out.println(yearNullCase + yearOutput + weeksNullCase + weeksOutput + dayNullCase + dayOutput + hourNullCase + hourOutput + minuteNullCase + minuteOutput + secondsNullCase + secondsOutput);

    }
}

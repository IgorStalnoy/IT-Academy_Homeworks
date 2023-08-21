package Homework_4;

public class Task4_10 {
    //Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается
    //симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51)
    public static void main(String[] args) {

        int hoursFirstDigit, hoursSecondDigit, minutesFirstDigit, minutesSecondDigit;
        int mirrorCounter = 0;

        for (int hoursInDay = 0; hoursInDay <= 23; hoursInDay++) {
            for (int minutesInHour = 0; minutesInHour <= 59; minutesInHour++) {
                hoursFirstDigit = hoursInDay % 10;
                hoursSecondDigit = hoursInDay / 10;
                minutesFirstDigit = minutesInHour % 10;
                minutesSecondDigit = minutesInHour / 10;
                boolean mirrorCheck = hoursSecondDigit == minutesFirstDigit && hoursFirstDigit == minutesSecondDigit;
                if (mirrorCheck){
                    mirrorCounter++;
                }
            }
        }
        System.out.println(mirrorCounter + " times a day time looks like a mirror");

    }
}

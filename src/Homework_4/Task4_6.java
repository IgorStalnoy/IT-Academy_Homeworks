package Homework_4;

public class Task4_6 {
    //В американской армии считается несчастливым число 13, а в японской — 4. Перед международными учениями штаб российской армии решил исключить номера боевой
    // техники, содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040), чтобы не смущать иностранных коллег. Если в распоряжении армии
    // имеется 100 тыс. единиц боевой техники и каждая боевая машина имеет номер от 00001 до 99999, то сколько всего номеров придётся исключить?
    public static void main(String[] args) {

        int unluckyTechniqueCounter = 0;

        for (int i = 1; i < 100000; i++) {
            int fourDigitCheck, thirteenNumberCheck;
            int engineryNumber = i;
            while (engineryNumber > 0) {
                fourDigitCheck = engineryNumber % 10;
                thirteenNumberCheck = engineryNumber % 100;
                if (fourDigitCheck == 4 || thirteenNumberCheck == 13) {
                    unluckyTechniqueCounter++;
                    break;
                }
                engineryNumber /= 10;
            }
        }
        System.out.println("For the exercises, " + unluckyTechniqueCounter + " pieces of equipment with an unlucky number will have to be excluded");
    }
}

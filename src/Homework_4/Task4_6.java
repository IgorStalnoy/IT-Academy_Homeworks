package Homework_4;

public class Task4_6 {
    //В американской армии считается несчастливым число 13, а в японской — 4. Перед международными учениями штаб российской армии решил исключить номера боевой
    // техники, содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040), чтобы не смущать иностранных коллег. Если в распоряжении армии
    // имеется 100 тыс. единиц боевой техники и каждая боевая машина имеет номер от 00001 до 99999, то сколько всего номеров придётся исключить?
    public static void main(String[] args) {

        int currentDigit, nextDigit, engineryNumberCheck;
        int unluckyTechniqueCounter = 0;
        boolean unluckyTechniqueCheck;

        for (int engineryNumber = 1; engineryNumber < 100000; engineryNumber++) {
            engineryNumberCheck = engineryNumber;
            do {
                currentDigit = engineryNumberCheck % 10;
                engineryNumberCheck = engineryNumberCheck / 10;
                nextDigit = engineryNumberCheck % 10;
                unluckyTechniqueCheck = currentDigit == 4 || nextDigit == 4 || (nextDigit == 1 && currentDigit == 3);
                if (unluckyTechniqueCheck) {
                    unluckyTechniqueCounter++;
//                    System.out.print(engineryNumber + " ");
                    break;
                }
            } while (engineryNumberCheck / 10 != 0);


        }

        System.out.println("For the exercises, " + unluckyTechniqueCounter + " pieces of equipment with an unlucky number will have to be excluded");

    }
}

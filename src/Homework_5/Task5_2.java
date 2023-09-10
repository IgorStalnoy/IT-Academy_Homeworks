package Homework_5;

import java.util.Random;

public class Task5_2 {
    //Исключить одинаковые элементы массива (каждое значение должно присутствовать в единственном экземпляре, размер нового массива должен быть равен
    // количеству уникальных элементов)
    public static void main(String[] args) {

        Random random = new Random();
        int[] randomArray = new int[20];
//        int[] randomArray = {55, 1, 1, 2, 3, 4, 0};  // Тестовые массивы
//        int[] randomArray = {18, 5, 24, -14, 0, -24, 5, 23, -2, 13, -6, -2, -24, -21, 17, -19};
//        int[] randomArray = {0, 1, 1, 2, 3, 4, 22};
//        int[] randomArray = {0, 1, 0, 2, 0, 4, 22};
        int resultArrayLength = randomArray.length;


        int firstRepeatingNumberCount = random.nextInt(4) + 2;     //Генерируем 3 случайных числа от -100 до 100, которые будут повторяться случайное
        int secondRepeatingNumberCount = random.nextInt(4) + 2;    //кол-во раз от 2 до 5. Затем заполняем наш массив сгенерированными значениями в случайные
        int thirdRepeatingNumberCount = random.nextInt(4) + 2;     //позиции массива. Затем заполняем оставшиейся значения случайными числами.
        int firstRepeatingNumber = random.nextInt(101) - random.nextInt(101);
        int secondRepeatingNumber = random.nextInt(101) - random.nextInt(101);
        int thirdRepeatingNumber = random.nextInt(101) - random.nextInt(101);
        while (firstRepeatingNumberCount > 0) {
            int randomPosition = random.nextInt(randomArray.length - 1);
            if (randomArray[randomPosition] == firstRepeatingNumber) {
                continue;
            }
            randomArray[randomPosition] = firstRepeatingNumber;
            firstRepeatingNumberCount--;
        }
        while (secondRepeatingNumberCount > 0) {
            int randomPosition = random.nextInt(randomArray.length - 1);
            if (randomArray[randomPosition] == secondRepeatingNumber || randomArray[randomPosition] == firstRepeatingNumber) {
                continue;
            }
            randomArray[randomPosition] = secondRepeatingNumber;
            secondRepeatingNumberCount--;
        }
        while (thirdRepeatingNumberCount > 0) {
            int randomPosition = random.nextInt(randomArray.length - 1);
            if (randomArray[randomPosition] == thirdRepeatingNumber || randomArray[randomPosition] == firstRepeatingNumber || randomArray[randomPosition] == secondRepeatingNumber) {
                continue;
            }
            randomArray[randomPosition] = thirdRepeatingNumber;
            thirdRepeatingNumberCount--;
        }
        for (int i = 0; i < randomArray.length; i++) {
            boolean checkRepeatedNumbers = randomArray[i] == firstRepeatingNumber || randomArray[i] == secondRepeatingNumber || randomArray[i] == thirdRepeatingNumber;
            if (checkRepeatedNumbers) {
                continue;
            }
            randomArray[i] = random.nextInt(101) - random.nextInt(101);
        }                                                                                                       //конец генерации массива

        System.out.print("Random");
        ArrayUtils.printArray(randomArray);

        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray.length; j++) {
                if (randomArray[j] == randomArray[i] && j > i) {
                    resultArrayLength--;
                    break;
                }
            }
        }

        int resultArrayPositionCounter = 0;
        boolean haveZero = false;
        int[] resultArray = new int[resultArrayLength];
        for (int k : randomArray) {
            for (int j = 0; j < resultArray.length; j++) {
                if (k == 0 && resultArray[j] == 0 && !haveZero) {
                    resultArrayPositionCounter++;
                    haveZero = true;
                    continue;
                }
                if (resultArray[j] == k || k == 0 && haveZero) {
                    break;
                }
                if (j == resultArray.length - 1) {
                    resultArray[resultArrayPositionCounter] = k;
                    resultArrayPositionCounter++;
                }
            }
        }

        if (resultArrayLength == 0) {
            System.out.print("All numbers of the source array are repeated, the length of the final array is 0");
        } else {
            System.out.print("Result");
            ArrayUtils.printArray(resultArray);
        }

    }
}


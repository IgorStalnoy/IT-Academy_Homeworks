package Homework_5;

public class Task5_1 {
    //Разложить положительные и отрицательные числа по разным массивам (сумма размеров новых массивов должна быть равна размеру исходного)
    public static void main(String[] args) {
        Homework_5_Methods arrayActions = new Homework_5_Methods();
        int[] randomArray = new int[20];
        int negativeArrayLength = 0;
        int positiveArrayLength = 0;
        int zeroCounter = 0;
        randomArray = arrayActions.fillingArrayWithRandomNumbers(randomArray);
        System.out.print("Random");
        arrayActions.printArray(randomArray);

        for (int j : randomArray) {
            if (j == 0) {
                zeroCounter++;
            } else if (j < 0) {
                negativeArrayLength++;
            } else {
                positiveArrayLength++;
            }
        }

        int[] negativeNumbersArray = new int[negativeArrayLength];
        int[] positiveNumbersArray = new int[positiveArrayLength];
        int negativeArrayPosition = 0;
        int positiveArrayPosition = 0;

        for (int j : randomArray) {
            if (j < 0) {
                negativeNumbersArray[negativeArrayPosition] = j;
                negativeArrayPosition++;
                continue;
            }
            if (j > 0) {
                positiveNumbersArray[positiveArrayPosition] = j;
                positiveArrayPosition++;
            }
        }

        if (zeroCounter > 0) {
            System.out.println("Zero is neither positive nor negative. There are " + zeroCounter + " nulls in the original array");
        }
        System.out.print("Negative numbers ");
        arrayActions.printArray(negativeNumbersArray);
        System.out.print("Positive numbers ");
        arrayActions.printArray(positiveNumbersArray);

    }
}

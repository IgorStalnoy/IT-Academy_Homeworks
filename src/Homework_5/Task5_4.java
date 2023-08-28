package Homework_5;

import java.util.Random;

public class Task5_4 {
    //Найти строку матрицы с максимальной суммой элементов
    public static void main(String[] args) {

        Homework_5_Methods arrayActions = new Homework_5_Methods();
        Random random = new Random();
        int randomMatrixStrings = random.nextInt(31) + 1;
        int randomMatrixColumns = random.nextInt(31) + 1;
        int[][] randomMatrix = new int[randomMatrixStrings][randomMatrixColumns];
        arrayActions.fillMatrixWithRandomNumbers(randomMatrix);

        int stringSum;
        int maxStringSum = 0;
        int maxStringSumPosition = 0;
        for (int i = 0; i < randomMatrix.length; i++) {
            stringSum = 0;
            for (int j = 0; j < randomMatrix[0].length; j++) {
                stringSum = stringSum + randomMatrix[i][j];
            }
            if (i == 0) {
                maxStringSum = stringSum;
            }
            if (stringSum > maxStringSum) {
                maxStringSum = stringSum;
                maxStringSumPosition = i;
            }

        }

        System.out.println("String number with maximum amount : " + maxStringSumPosition);
        System.out.println("Maximum sum of values in one string : " + maxStringSum);
        arrayActions.printMatrix(randomMatrix);

    }
}

package Homework_5;

import java.util.Random;

abstract class ArrayUtils {

    static Random random = new Random();

    public static void fillArrayWithRandomNumbers(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(101) - random.nextInt(101);
        }
    }

    public static void printArray(int[] inputArray) {
        System.out.print(" array : { ");
        for (int i : inputArray) {
            System.out.printf("%3d ", i);
        }
        System.out.print("} Array length : " + inputArray.length + "\n");
    }

    public static void fillArrayWithOrderedNumbers(int[] inputArray) {
        inputArray[0] = random.nextInt(180) - random.nextInt(200);
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(101) - random.nextInt(101);
        }

        for (int i = 0; i < inputArray.length; i++) {
            int minBuffer;
            int min = inputArray[i];
            int minPosition = i;
            for (int j = i; j < inputArray.length; j++) {
                if (inputArray[j] < min) {
                    min = inputArray[j];
                    minPosition = j;
                }
            }
            minBuffer = inputArray[i];
            inputArray[i] = min;
            inputArray[minPosition] = minBuffer;
        }
    }

    public static void fillMatrixWithRandomNumbers(int[][] inputMatrix) {
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                inputMatrix[i][j] = random.nextInt(101) - random.nextInt(101);
            }
        }
    }

    public static void printMatrix(int[][] inputMatrix) {
        System.out.print("Strings/columns  ");
        for (int i = 0; i < inputMatrix[0].length; i++) {
            System.out.printf("%5d ", i);
        }
        for (int i = 0; i < inputMatrix.length; i++) {
            System.out.println();
            System.out.printf("       String%3d |", i);
            for (int j = 0; j < inputMatrix[0].length; j++) {
                System.out.printf("%4d |", inputMatrix[i][j]);
            }
        }
    }

}

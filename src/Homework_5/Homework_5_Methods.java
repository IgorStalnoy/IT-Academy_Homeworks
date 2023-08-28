package Homework_5;

import java.util.Random;

public class Homework_5_Methods {

    Random random = new Random();

    public int[] fillingArrayWithRandomNumbers(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(101) - random.nextInt(101);
        }
        return inputArray;
    }

    public void printArray(int[] inputArray) {
        System.out.print(" array : { ");
        for (int i : inputArray) {
            System.out.printf("%3d ", i);
        }
        System.out.print("} Array length : " + inputArray.length + "\n");
    }

    public void printInvertArray(int[] inputArray) {
        System.out.print(" array : { ");
        for (int i = inputArray.length - 1; i >= 0; i--) {
            System.out.printf("%3d ", inputArray[i]);
        }
        System.out.print("} Array length : " + inputArray.length + "\n");
    }

    public int[] fillArrayWithOrderedNumbers(int[] inputArray) {
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
        return inputArray;
    }

    public void fillMatrixWithRandomNumbers(int[][] inputMatrix) {
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                inputMatrix[i][j] = random.nextInt(101) -  random.nextInt(101);
            }
        }
    }

    public void printMatrix(int[][] inputMatrix) {
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

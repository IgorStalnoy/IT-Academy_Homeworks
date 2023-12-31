package Homework_5;

import java.util.Random;

public class Task5_5 {
    //Сделать транспонирование матрицы (замена строк на столбцы)
    public static void main(String[] args) {

        Random random = new Random();
        int randomMatrixStrings = random.nextInt(21) + 1;
        int randomMatrixColumns = random.nextInt(21) + 1;
        int[][] randomMatrix = new int[randomMatrixStrings][randomMatrixColumns];
        int[][] resultMatrix = new int[randomMatrixColumns][randomMatrixStrings];
        ArrayUtils.fillMatrixWithRandomNumbers(randomMatrix);
        System.out.println("Source array");
        ArrayUtils.printMatrix(randomMatrix);

        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix[0].length; j++) {
                resultMatrix[j][i] = randomMatrix[i][j];
            }
        }

        System.out.println("\nResult array");
        ArrayUtils.printMatrix(resultMatrix);

    }
}

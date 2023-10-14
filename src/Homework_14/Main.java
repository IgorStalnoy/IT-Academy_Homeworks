package Homework_14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

/**
 * Создайте матрицу размера n*m. Создайте два потока, один из которых перемножает все значения в столбцах и потом находит сумму, а другой поток перемножает все
 * значения в строках и тоже потом находит сумму. Определите какое число больше. Обязательно использовать пулы потоков
 */

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int[][] matrix = Stream.generate(() -> new Random().ints(5, 1, 11).toArray()).limit(8)
                .toArray(int[][]::new);
        Arrays.stream(matrix).forEach(s -> System.out.println(Arrays.toString(s)));
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Future<Integer> rowsCalculation = ex.submit(new RowsCalculate(matrix));
        Future<Integer> columnsCalculation = ex.submit(new ColumnsCalculate(matrix));
        System.out.println("\n" + "Rows calculation result: " + rowsCalculation.get() + "\nColumns calculation result: " + columnsCalculation.get() + "\nBiggest number: ");
        Stream.of(rowsCalculation.get(), columnsCalculation.get()).max(Comparator.comparingInt(Integer::intValue)).ifPresent(System.out::println);
        ex.shutdown();

    }
}

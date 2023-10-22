package Homework_14;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.stream.IntStream;

public class ColumnsCalculate implements Callable<Integer> {
    int[][] matrix;

    public ColumnsCalculate(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public Integer call() {
        return IntStream.range(0, matrix[0].length).map(x -> Arrays.stream(matrix).map(a -> a[x]).reduce((b, c) -> b * c)
                .get()).reduce(Integer::sum).orElseThrow(NullPointerException::new);
    }
}

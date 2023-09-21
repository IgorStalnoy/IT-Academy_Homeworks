package Homework_10.Task10_3;

public class TwoDimIterator<T> {

    private final T[][] array;
    private int rowPosition = 0;
    private int columnPosition = 0;

    public TwoDimIterator(T[][] array) {
        this.array = array;
    }

    public void next() {
        while (hasNext()) {
            while (columnPosition < array[array.length - 1].length) {
                System.out.print(array[rowPosition][columnPosition] + " ");
                columnPosition++;
            }
            rowPosition++;
            columnPosition = 0;
            System.out.println();
        }
    }

    private boolean hasNext() {
        return rowPosition < array.length && columnPosition < array[array.length - 1].length;
    }
}

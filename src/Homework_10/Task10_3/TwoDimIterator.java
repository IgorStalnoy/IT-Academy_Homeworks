package Homework_10.Task10_3;

public class TwoDimIterator<T> {

    private final T[][] array;
    private int rowPosition = 0;
    private int columnPosition = 0;

    public TwoDimIterator(T[][] array) {
        this.array = array;
    }

    public T next() {
        if (columnPosition == array[rowPosition].length) {
            rowPosition++;
            columnPosition = 1;
        } else {
            columnPosition++;
        }
        return array[rowPosition][columnPosition - 1];
    }
    public boolean hasNext() {
        return rowPosition != array.length - 1 || columnPosition != array[array.length - 1].length;
    }
}

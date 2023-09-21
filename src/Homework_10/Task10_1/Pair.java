package Homework_10.Task10_1;

public class Pair<T> {
    private T firstValue;
    private T lastValue;

    public Pair(T firstValue, T lastValue) {
        this.firstValue = firstValue;
        this.lastValue = lastValue;
    }

    public void swap() {
        T temp = this.firstValue;
        this.firstValue = this.lastValue;
        this.lastValue = temp;
    }

    public T first() {
        return firstValue;
    }

    public void replaceFirst(T firstValue) {
        this.firstValue = firstValue;
    }

    public T last() {
        return lastValue;
    }

    public void replaceLast(T lastValue) {
        this.lastValue = lastValue;
    }

    @Override
    public String toString() {
        return "{" +
                "firstValue=" + firstValue +
                ", secondValue=" + lastValue +
                '}';
    }
}

package Homework_9.Task9_1;

public class CustomStack<T extends Comparable<T>> {

    private CustomStackElement<T> firstElement = null;
    private CustomStackElement<T> maxElement = null;

    private static class CustomStackElement<T extends Comparable<T>> implements Comparable<T> {

        private final T stackElementLink;
        private CustomStackElement<T> nextElementLink = null;
        private CustomStackElement<T> previousMaxElementLink;

        public CustomStackElement(T element) {
            this.stackElementLink = element;
        }

        @Override
        public String toString() {
            return "" + stackElementLink;
        }

        @Override
        public int compareTo(T element) {
            return stackElementLink.compareTo(element);
        }
    }

    public void push(T element) {
        CustomStackElement<T> temp = new CustomStackElement<>(element);
        if (isStackEmpty()) {
            maxElement = temp;
        }
        if (!isStackEmpty()) {
            temp.previousMaxElementLink = maxElement;
            temp.nextElementLink = firstElement;
            if (temp.compareTo(maxElement.stackElementLink) > 0) {
                maxElement = temp;
            }
        }
        firstElement = temp;
    }

    public CustomStackElement<T> pop() {
        if (isStackEmpty()) {
            return null;
        } else {
            CustomStackElement<T> temp = firstElement;
            maxElement = temp.previousMaxElementLink;
            firstElement = firstElement.nextElementLink;
            return temp;
        }
    }

    private boolean isStackEmpty() {
        return firstElement == null;
    }

    @Override
    public String toString() {
        CustomStackElement<T> temp = firstElement;
        String result = "";
        if (!isStackEmpty()) {
            while (temp != null) {
                result = result.concat(temp.toString()) + '\n';
                temp = temp.nextElementLink;
            }
        }
        return result;
    }

    public CustomStackElement<T> getMaxElement() {
        return maxElement;
    }
}



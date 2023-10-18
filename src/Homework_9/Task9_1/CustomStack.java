package Homework_9.Task9_1;

public class CustomStack<T extends Comparable<T>> {

    private CustomStackElement<T> stackPointer = null;
    private CustomStackElement<T> max = null;

    private static class CustomStackElement<T extends Comparable<T>> {

        private final T stackElement;
        private CustomStackElement<T> next = null;
        private CustomStackElement<T> previousMax;

        public CustomStackElement(T element) {
            this.stackElement = element;
        }

        @Override
        public String toString() {
            return "" + stackElement;
        }


    }

    public void push(T element) {
        CustomStackElement<T> temp = new CustomStackElement<>(element);
        if (isStackEmpty()) {
            max = temp;
        } else {
            temp.previousMax = max;
            temp.next = stackPointer;
            if (temp.stackElement.compareTo(max.stackElement) > 0) {
                max = temp;
            }
        }
        stackPointer = temp;
    }

    public T pop() {
        if (isStackEmpty()) {
            return null;
        } else {
            CustomStackElement<T> temp = stackPointer;
            max = temp.previousMax;
            stackPointer = stackPointer.next;
            return temp.stackElement;
        }
    }

    private boolean isStackEmpty() {
        return stackPointer == null;
    }

    @Override
    public String toString() {
        CustomStackElement<T> temp = stackPointer;
        String result = "";
        if (!isStackEmpty()) {
            while (temp != null) {
                result = result.concat(temp.toString()) + '\n';
                temp = temp.next;
            }
        }
        return result;
    }

    public T getMaxElement() {
        return max.stackElement;
    }
}



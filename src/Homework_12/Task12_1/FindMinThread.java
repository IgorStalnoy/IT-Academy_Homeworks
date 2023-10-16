package Homework_12.Task12_1;

public class FindMinThread extends Thread {

    private final int[] array;
    private int searchResult;

    public FindMinThread(int[] array) {
        this.array = array;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is started");
        findMin();
        System.out.println(searchResult);
    }

    private void findMin() {
        searchResult = array[0];
        for (int i : array) {
            if (i < searchResult) {
                searchResult = i;
            }
        }
    }

    public int getSearchResult() {
        return searchResult;
    }
}

package Homework_12.Task12_1;

public class FindMaxThread extends Thread {

    private final int[] array;
    private int searchResult;

    public FindMaxThread(int[] array) {
        this.array = array;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is started");
        findMax();
        System.out.println(searchResult);
    }

    private void findMax() {
        searchResult = array[0];
        for (int i : array) {
            if (i > searchResult) {
                searchResult = i;
            }
        }
    }

    public int getSearchResult() {
        return searchResult;
    }
}

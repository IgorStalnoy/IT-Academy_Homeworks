package Homework_16;

public class Consumer implements Runnable {
    Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 0; i < 10;) {
            i = store.get(i);
        }
    }
}

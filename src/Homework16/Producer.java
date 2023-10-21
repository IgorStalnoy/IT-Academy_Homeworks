package Homework16;


public class Producer implements Runnable {
    Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 10; i++) {
            store.put();
        }
    }
}

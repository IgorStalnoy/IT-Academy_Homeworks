package Homework_16;

import java.util.concurrent.Semaphore;
public class Main {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(0);
        Store store = new Store(semaphore);
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

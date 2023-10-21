package Homework16;

import java.util.concurrent.Semaphore;

public class Store {
    Semaphore semaphore;

    public Store(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    private int messageCount = 0;

    public synchronized void get() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (messageCount < 1) {
            try {
                System.out.printf("Consumer(%d): Нет сообщений\n", messageCount);
                Thread.sleep(400);
                semaphore.release();
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Consumer(%d): Сообщение прочитано\n", messageCount);
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        messageCount--;
        notifyAll();
        semaphore.release();
    }

    public synchronized void put() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (messageCount >= 3) {
            try {
                System.out.printf("Producer(%d): Буффер переполнен\n", messageCount);
                Thread.sleep(400);
                semaphore.release();
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Producer(%d): Сообщение отправлено\n", messageCount);
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        messageCount++;
        notifyAll();
        semaphore.release();
    }
}
package Homework_16;

import java.util.concurrent.Semaphore;
import static java.lang.Thread.sleep;

public class Store {
    private final Semaphore semaphore;

    public Store(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    private int messageCount = 0;

    public int get(int i) {
        try {
            if (messageCount < 1) {
                semaphore.release();
                System.out.printf("Consumer(%d): Нет сообщений\n", messageCount);
                sleep(500);
            } else {
                semaphore.acquire();
                messageCount--;
                i++;
                System.out.println(i + "сообщений прочитано");
                sleep(500);
                System.out.printf("Consumer(%d): Сообщение прочитано\n", messageCount);
                sleep(500);
                semaphore.release();
            }
            return i;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int put(int i) {
        try {
            if (messageCount >= 3) {
                semaphore.release();
                System.out.printf("Producer(%d): Буффер переполнен\n", messageCount);
                sleep(500);
            } else {
                semaphore.acquire();
                messageCount++;
                i++;
                System.out.println(i + "сообщений отправлено");
                sleep(500);
                System.out.printf("Producer(%d): Сообщение отправлено\n", messageCount);
                sleep(500);
                semaphore.release();
            }
            return i;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
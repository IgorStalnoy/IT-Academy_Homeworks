package Homework_12.Task12_3;

import java.util.List;
import java.util.Random;

public class Generator extends Thread {

    private final List<Integer> list;

    public Generator(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        addIntToList();
    }

    private void addIntToList() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100) + 1);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

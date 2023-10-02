package Homework_12.Task12_3;

import java.util.LinkedList;
import java.util.List;

/**
 * Создать класс Generator extends Thread. В конструктор класса передается List<Integer> ссылка на который сохраняется в классе. В методе run() в list по
 * одному добавляются случайные числа и после каждого добавления поток “засыпает” (sleep) на 200 msec. В лист должно добавится 100 чисел
 */

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new LinkedList<>();
        Generator generator = new Generator(integerList);
        generator.start();
        try {
            generator.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(integerList);

    }
}

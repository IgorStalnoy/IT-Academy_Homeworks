package Homework_12.Task12_1;

import java.util.Arrays;
import java.util.Random;

/**
 * Пользователь вводит с клавиатуры значение в массив. После чего запускаются два потока. Первый поток находит максимум в массиве, второй — минимум.
 * Результаты вычислений возвращаются в метод main()
 */

public class Main {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " is started");
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(array));

        FindMaxThread findMaxThread = new FindMaxThread(array);
        FindMinThread findMinThread = new FindMinThread(array);
        findMaxThread.setName("findMaxThread");
        findMinThread.setName("findMinThread");
        System.out.println(findMaxThread.getState());
        System.out.println(findMinThread.getState());
        findMaxThread.start();
        findMinThread.start();

//        if (findMaxThread.getState() != Thread.State.TERMINATED) {
//            try {
//                findMaxThread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        if (findMinThread.getState() != Thread.State.TERMINATED) {
//            try {
//                findMaxThread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        System.out.println(findMaxThread.getState());
        System.out.println(findMinThread.getState());

        System.out.println(findMaxThread.getSearchResult() + " is max number in array");
        System.out.println(findMinThread.getSearchResult() + " is min number in array");

    }
}
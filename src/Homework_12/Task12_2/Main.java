package Homework_12.Task12_2;

import java.io.File;
import java.io.IOException;

/**
 * Заданы три целочисленных массива. Записать эти массивы в файл (общий) в параллельных потоках. Создать класс SaveAsThread для представления
 * потока, который записывает целочисленный массив в файл. Доступ к файлу должен быть синхронизирован чтобы массивы не перемешались.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {

        String filePath = "Array_file";
        File file = new File(filePath);
        try {
            if (file.exists()) {
                file.delete();
            } else {
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int[] array1 = {20, 64, 41, 71, 65, 5, 95, 19, 33, 99, 20, 6, 86, 81, 15, 21, 37, 12, 91, 22};
        int[] array2 = {2, 41, 84, 1, 89, 33, 59, 46, 52, 23, 19, 28, 30, 39, 21, 10, 21, 25, 12, 22};
        int[] array3 = {84, 14, 91, 51, 6, 13, 3, 59, 9, 70, 39, 33, 93, 55, 64, 73, 44, 78, 86, 41};

        SaveAsThread saveAsThread = new SaveAsThread(array1, file);
        SaveAsThread saveAsThread2 = new SaveAsThread(array2, file);
        SaveAsThread saveAsThread3 = new SaveAsThread(array3, file);
        saveAsThread.setName("firstTread");
        saveAsThread2.setName("secondTread");
        saveAsThread3.setName("thirdTread");

        saveAsThread.start();
        System.out.println(Thread.currentThread().getState());
        saveAsThread2.start();
        System.out.println(Thread.currentThread().getState());
        saveAsThread3.start();
        System.out.println(Thread.currentThread().getState());

    }
}

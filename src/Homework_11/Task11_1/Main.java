package Homework_11.Task11_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Даны 2 файла - in1.txt и in2.txt в каждом файле по 1000 чисел от 1 до 100000. Создайте файл out.txt, который будет
 * содержать все отсортированные числа из файлов in1.txt и in2.txt. Файлы in1.txt и in2.txt можно создать с помощью кода.
 */
public class Main {

    public static void main(String[] args) {

        int[] array = new int[2000];
        FileUtils fileUtils = new FileUtils();
        fileUtils.createFileWithNumbers("in1.txt");
        fileUtils.createFileWithNumbers("in2.txt");
        array = fileUtils.readFile(array, 0, "in1.txt");
        array = fileUtils.readFile(array, 1000, "in2.txt");
        Arrays.sort(array);
        try (FileWriter fileWriter3 = new FileWriter("out.txt")) {
            for (int i : array) {
                fileWriter3.write(i + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

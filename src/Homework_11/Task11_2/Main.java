package Homework_11.Task11_2;

import java.io.*;
import java.util.Random;

/**
 * Записать в двоичный файл 30 случайных чисел от 1 до 100. Прочитать записанный файл распечатать числа и их среднее арифметическое.
 */

public class Main {

    public static void main(String[] args) {

        try (OutputStream outputStream = new FileOutputStream("binary.txt")) {
            for (int i = 0; i < 30; i++) {
                outputStream.write(new Random().nextInt(100) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int sum = 0,count = 0;
        try (InputStream inputStream = new FileInputStream("binary.txt")) {
            int i;
            while ((i = inputStream.read()) != -1){
                sum = sum + i;
                count++;
                System.out.print(i + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nArithmetical mean : " + (double)sum/count);

    }
}

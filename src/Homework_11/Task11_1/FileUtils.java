package Homework_11.Task11_1;

import java.io.*;
import java.util.Random;

public class FileUtils {

    public void CreateFileWithNumbers(String name) {

        try (BufferedWriter out = new BufferedWriter(new FileWriter(name))) {
            for (int i = 0; i < 1000; i++) {
                out.write((new Random().nextInt(100000) + 1) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFileDataToArray(int[] array, int startIndex, String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int temp;
            int i = startIndex;
            StringBuilder numbers1 = new StringBuilder();
            while ((temp = br.read()) != -1) {
                if (temp != 32) {
                    numbers1.append((char) temp);
                } else {
                    array[i] = Integer.parseInt(numbers1.toString());
                    i++;
                    numbers1 = new StringBuilder();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

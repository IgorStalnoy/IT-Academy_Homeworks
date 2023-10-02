package Homework_12.Task12_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveAsThread extends Thread {

    private final int[] array;
    private final File file;

    public SaveAsThread(int[] array, File file) {
        this.array = array;
        this.file = file;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " thread is started");
        writeToFile();
    }

    private void writeToFile() {
        synchronized (file) {
            try (BufferedWriter out = new BufferedWriter(new FileWriter(file, true))) {
                for (int i : array) {
                    out.write(i + " ");
                    System.out.println(Thread.currentThread().getName() + " is writing " + i);
                }
                out.write("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

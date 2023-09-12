package Homework_8;

import java.util.Scanner;

/**
 * Введите строку. Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец строки 'zzz'.
 */
public class Task8_1 {
    public static void main(String[] args) {

        Scanner inputText = new Scanner(System.in);
        String text;
        System.out.println("Please input text");
        text = inputText.next();

        if (text.startsWith("abc")) {
            text = text.replaceFirst("abc", "www");
        } else {
            text = text + "www";
        }
        System.out.println("Result of text processing : \n" + text);
    }
}

package Homework_13.Task13_2;

import java.util.*;

/**
 * Создать список строк List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
 * Используя stream и lambda выполнить следующие действия:
 * ○ Удалить все содержащие “3”
 * ○ Отсортировать сперва по числу (по возрастанию), потом по букве (по убыванию)
 * ○ Отбросить первый и последний элемент
 * ○ Привести в uppercase
 * ○ Выдать на печать результат
 * ○ Напечатать количество оставшихся элементов
 */

public class Main {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        myList = myList.stream().filter(s -> !s.contains("3"))
                .sorted(Comparator.comparing(s -> s.charAt(1)))
                .sorted(Collections.reverseOrder(Comparator.comparing(s -> s.charAt(0))))
                .skip(1)
                .limit(myList.size()-2)
                .map(String::toUpperCase).toList();

        System.out.print(myList + "\nResult list size is " + myList.size());

    }
}

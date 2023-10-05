package Homework_13.Task13_1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Дана коллекция Collection<Integer> col. С помощью stream API:
 * ○ найти минимальное число
 * ○ найти максимальное число
 * ○ найти среднее арифметическое чисел
 * ○ найти произведение всех чисел
 * ○ найти сумму всех чисел
 * ○ найти сумму всех цифр
 */

public class Main {
    public static void main(String[] args) {

        Collection<Integer> col = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            col.add(random.nextInt(101));
        }

        col.stream().min(Comparator.comparingInt(Integer::intValue)).ifPresent(min -> System.out.println(min + " is min number"));
        col.stream().max(Comparator.comparingInt(Integer::intValue)).ifPresent(max -> System.out.println(max + " is max number"));
        col.stream().mapToInt(Integer::intValue).average().ifPresent(avg -> System.out.println(avg + " is average"));
        col.stream().reduce((a, b) -> a * b).ifPresent(multi -> System.out.println(multi + " is multiplication result"));
        col.stream().reduce(Integer::sum).ifPresent(sum -> System.out.println(sum + " is sum result"));
        Arrays.stream(col.stream().map(Object::toString).collect(Collectors.joining()).split("")).
                mapToInt(Integer::parseInt).reduce(Integer::sum).ifPresent(sum -> System.out.println(sum + " is digits sum result"));

        System.out.println(col);

    }
}

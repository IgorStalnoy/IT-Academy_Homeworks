package Homework_9.Task9_2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String text = "The Chernobyl nuclear disaster was one of the deadliest accidents of the twentieth century. This is a story about that event seen through " +
                "the eyes of a father and his sons, who were all unfortunate enough to be close to the disaster area." +
                "The story exposes the whole system of corruption that led to a massive explosion taking innocent lives and poisoning multiple generations. The " +
                "technical vocabulary and foreign words make this text a little more difficult. However, its plot is relatively easy to follow." +
                "The story is divided into small parts that make it both easy and exciting to read. Its various events show what it was like to live in the former" +
                " Soviet Union. And just like any other good story, it’s also about human relationships and how they change due to historic events.";

        getCharsCount(text).forEach((k, v) -> System.out.print(k + ":" + v + ", "));
    }

    public static HashMap<Character, Integer> getCharsCount(String string) {
        char[] charArray = string.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : charArray) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return map;
    }
}

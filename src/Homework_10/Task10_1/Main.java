package Homework_10.Task10_1;

import Homework_9.Task9_1.Phone;

/**
 * Реализовать класс Pair, который будет содержать
 *  2 значения (два поля) любого типа (оба поля одного типа). Класс умеет выводить:
 *      ○    first() - возвращает 1ый элемент
 *      ○    last() - возвращает 2ой элемент
 *      ○    swap() - меняет элементы местами
 *      ○    replaceFirst() - заменяет 1ый элемент на новый
 *      ○    replaceLast() - заменяет 2ой элемент на новый
 */

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(37529_111_11_11L, "Nokia 3310", 0.133, 200);
        Phone phone2 = new Phone(37529_222_22_22L, "Siemens ME45", 0.099, 300);
        Phone phone3 = new Phone(37529_333_33_33L, "Samsung C100", 0.076, 400);
        Phone phone4 = new Phone(37529_444_44_44L, "iPhone 10", 0.176, 1000);

        Pair<Phone> pair1 = new Pair<>(phone1, phone2);
        System.out.println(pair1);
        pair1.swap();
        System.out.println(pair1.first() + " " + pair1.last());
        System.out.println(pair1);
        pair1.replaceFirst(phone3);
        System.out.println(pair1);
        pair1.replaceLast(phone4);
        System.out.println(pair1);

    }
}

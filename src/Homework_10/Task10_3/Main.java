package Homework_10.Task10_3;

/**
 * Написать итератор по двумерному массиву
 *  Ваш класс должен содержать 2 метода - hasNext() и next()
*/

public class Main {
    public static void main(String[] args) {

        Integer[][] array = {{33,2,5,3,9,8,5},{12,26,59,1,89,4,58},{23,14,12,5,6,3,47}};
        TwoDimIterator<Integer> twoDimIterator = new TwoDimIterator<>(array);

        twoDimIterator.next();
        }
    }


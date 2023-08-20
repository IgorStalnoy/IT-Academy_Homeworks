package Homework_4;

public class Task4_5 {
    //Выведите на экран первые 10 членов последовательности Фибоначчи
    public static void main(String[] args) {

        int currentNumber;
        int lastNumber1 = 1;
        int lastNumber2 = 0;
        System.out.println("Fibonacci sequence");
        System.out.print(lastNumber2 + " " + lastNumber1 + " ");

        for (int i = 3; i <= 20; i++) {
            currentNumber = lastNumber1 + lastNumber2;
            lastNumber2 = lastNumber1;
            lastNumber1 = currentNumber;
            System.out.print(currentNumber + " ");
        }

    }
}

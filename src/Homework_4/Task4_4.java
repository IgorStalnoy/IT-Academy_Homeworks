package Homework_4;

import static Homework_4.KeyboardInputMethods.*;
public class Task4_4 {
    //Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры
    public static void main(String[] args) {

        System.out.print("To calculate the factorial, ");
        long factorial = 1;
        int inputNumber;
        do {
            inputNumber = keyboardInputIntegerPositiveInteger();
            if (inputNumber > 20) {
                System.out.println("The factorial for the given number is too large, please enter a number less");
            }
        } while (inputNumber > 20);

        for (int i = 1; i <= inputNumber; i++) {
            factorial = factorial * i;
        }

        System.out.println("(" + inputNumber + ")! = " + factorial);

    }
}

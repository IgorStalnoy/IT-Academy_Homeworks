package Homework_4;

import static Homework_4.KeyboardInputMethods.*;

public class Task4_2 {
    //Найдите сумму и произведение цифр числа, введенного с клавиатуры
    public static void main(String[] args) {

        int inputNumber = Math.abs(keyboardInputInteger());
        int lastDigit, digitsSum = 0, digitsMultiplication = 1;
        boolean oneDigitCheck = inputNumber / 10 == 0;

        while (inputNumber > 0) {
            lastDigit = inputNumber % 10;
            digitsSum = digitsSum + lastDigit;
            digitsMultiplication = digitsMultiplication * lastDigit;
            inputNumber /= 10;
        }

        System.out.println("The sum of the digits of the entered number: " + digitsSum);

        if (oneDigitCheck){
            System.out.println("The entered number has only one digit, at least 2 digits are required to multiply the digits");
        } else {
            System.out.println("The multiplication of the digits of the entered number: " + digitsMultiplication);
        }

    }
}

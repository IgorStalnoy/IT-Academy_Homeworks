package Homework_4;

import static Homework_4.KeyboardInputMethods.*;

public class Task4_3 {
    //Найдите самую большую цифру числа, введенного с клавиатуры, а также ее индекс
    public static void main(String[] args) {

        int nextDigit, maxIndex, maxDigit;
        int inputNumber = Math.abs(keyboardInputInteger());
        int inputNumber2 = inputNumber;
        maxDigit = inputNumber % 10;
        maxIndex = 1;

        while (inputNumber / 10 != 0) {
            inputNumber = inputNumber / 10;
            nextDigit = inputNumber % 10;
            if (nextDigit > maxDigit) {
                maxDigit = nextDigit;
            }
        }

        System.out.println("Max digit: " + maxDigit);
        System.out.print("Max digit's index : ");

        if (inputNumber2 / 10 == 0) {
            System.out.println(maxIndex);
        } else {
            for (int digitIndex = 1; inputNumber2 != 0; digitIndex++) {    //Доработка задания в классе - выводит все индексы максимальной цифры, если их более одного
                nextDigit = inputNumber2 % 10;
                if (nextDigit == maxDigit) {
                    System.out.print(digitIndex + " ");
                }
                inputNumber2 = inputNumber2 / 10;
            }
        }
    }

}


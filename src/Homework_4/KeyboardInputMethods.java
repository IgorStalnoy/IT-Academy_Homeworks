package Homework_4;

import java.util.Scanner;

abstract class KeyboardInputMethods {
    public static int keyboardInputInteger() {
        int inputNumber = 0;
        System.out.print("Please input an integer: ");
        boolean numberValidation;

        do {
            Scanner in = new Scanner(System.in);
            numberValidation = in.hasNextInt();
            if (!numberValidation) {
                System.out.println("You input not an integer, please input an integer");
            } else {
                inputNumber = in.nextInt();
            }
        }
        while (!numberValidation);
        return inputNumber;
    }


    static int keyboardInputIntegerPositiveInteger() {
        int inputNumber = 0;
        System.out.print("Please input a positive integer: ");
        boolean numberValidation;

        do {
            Scanner in = new Scanner(System.in);
            numberValidation = in.hasNextInt();
            if (!numberValidation) {
                System.out.println("You input not a positive integer, please input a positive integer");
            } else {
                inputNumber = in.nextInt();
                if (inputNumber < 0) {
                    System.out.println("You input not a positive integer, please input a positive integer");
                    numberValidation = false;
                }
            }
        }
        while (!numberValidation);
        return inputNumber;
    }
}
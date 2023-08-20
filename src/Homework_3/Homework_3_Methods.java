package Homework_3;

import java.util.Scanner;

public class Homework_3_Methods {
    public int integerInput() {
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
}

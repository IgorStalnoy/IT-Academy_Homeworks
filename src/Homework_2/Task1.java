package Homework_2;

import java.util.Scanner;

public class Task1 {
    //Вывести последнюю цифру числа
    public static void main(String[] args) {

        int firstInputInteger;
        int secondInputInteger;
        boolean numberValidation;

        Scanner in = new Scanner(System.in);
        System.out.print("Please, input an integer: ");
        numberValidation = in.hasNextInt();

        if (numberValidation == false) {
            for (; numberValidation == false; ) {
                Scanner in2 = new Scanner(System.in);
                System.out.print("You didn't enter an integer, please enter an integer: ");
                numberValidation = in2.hasNextInt();
                if (numberValidation == true) {
                    secondInputInteger = Math.abs(in2.nextInt());
                    if ((secondInputInteger / 10) < 1) {
                        System.out.println("The last digit of the entered number is " + secondInputInteger);
                    } else {
                        System.out.println("The last digit of the entered number is " + secondInputInteger % 10);
                    }
                }
            }
        } else {
            firstInputInteger = Math.abs(in.nextInt());
            if ((firstInputInteger / 10) < 1) {
                System.out.println("The last digit of the entered number is " + firstInputInteger);
            } else {
                System.out.println("The last digit of the entered number is " + firstInputInteger % 10);
            }
        }
    }
}

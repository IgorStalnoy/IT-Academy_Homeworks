package Homework_2;

import java.util.Scanner;

public class Task2 {
    //Найти сумму цифр ab + cd числа abcd
    public static void main(String[] args) {

        int firstInputInteger = 0;
        int secondInputInteger;
        boolean numberValidation;

        Scanner in = new Scanner(System.in);
        System.out.print("Please, input a four-digit number: ");
        numberValidation = in.hasNextInt();
        if (numberValidation == true) {
            firstInputInteger = Math.abs(in.nextInt());
            if ((firstInputInteger / 1000) >= 1 && (firstInputInteger / 1000) < 10) {
                numberValidation = true;
            } else
                numberValidation = false;
        }


        if (numberValidation == false) {
            for (; numberValidation == false; ) {
                Scanner in2 = new Scanner(System.in);
                System.out.print("You didn't enter a four-digit number, please enter a four-digit number: ");
                numberValidation = in2.hasNextInt();
                if (numberValidation == true) {
                    secondInputInteger = Math.abs(in2.nextInt());
                    if ((secondInputInteger / 1000) >= 1 && (secondInputInteger / 1000) < 10) {
                        numberValidation = true;
                        System.out.println("The sum of the numbers of the first two and the last two digits of the entered number : " + ((secondInputInteger / 100) + (secondInputInteger) % 100));
                    } else {
                        numberValidation = false;
                    }

                }
            }
        } else {
            System.out.println("The sum of the numbers of the first two and the last two digits of the entered number : " + ((firstInputInteger / 100) + (firstInputInteger) % 100));
        }
    }
}

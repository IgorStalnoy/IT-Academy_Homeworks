package Homework_2;

import java.util.Scanner;

public class Task3 {
    //Вывести 3юю цифру 5ти-значного числа
    public static void main(String[] args) {

        int firstInputInteger = 0;
        int secondInputInteger;
        boolean numberValidation;

        Scanner in = new Scanner(System.in);
        System.out.print("Please, input a five-digit number: ");
        numberValidation = in.hasNextInt();
        if (numberValidation == true) {
            firstInputInteger = Math.abs(in.nextInt());
            if ((firstInputInteger / 10000) >= 1 && (firstInputInteger / 10000) < 10) {
                numberValidation = true;
            } else
                numberValidation = false;
        }


        if (numberValidation == false) {
            for (; numberValidation == false; ) {
                Scanner in2 = new Scanner(System.in);
                System.out.print("You didn't enter a five-digit number, please enter a five-digit number: ");
                numberValidation = in2.hasNextInt();
                if (numberValidation == true) {
                    secondInputInteger = Math.abs(in2.nextInt());
                    if ((secondInputInteger / 10000) >= 1 && (secondInputInteger / 10000) < 10) {
                        numberValidation = true;
                        secondInputInteger = secondInputInteger % 1000;
                        secondInputInteger = secondInputInteger / 100;
                        System.out.println("The third digit of the entered number : " + secondInputInteger);
                    } else {
                        numberValidation = false;
                    }

                }
            }
        } else {
            firstInputInteger = firstInputInteger % 1000;
            firstInputInteger = firstInputInteger / 100;
            System.out.println("The third digit of the entered number : " + firstInputInteger);
        }
    }
}

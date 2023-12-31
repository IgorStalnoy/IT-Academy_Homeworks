package Homework_2;

import java.util.Scanner;

public class Task4 {
    //Вывести длину отрезка, проходящей через две точки
    public static void main(String[] args) {

        double x1 = 0, y1 = 0, x2 = 0, y2 = 0, distance = 0;
        boolean numberValidation;


        Scanner in1 = new Scanner(System.in);                //x1 validation start
        System.out.print("To calculate the length of a segment, you need to enter the coordinates of two points. Please, input x1 integer: ");
        numberValidation = in1.hasNextInt();

        if (numberValidation == false) {
            for (; numberValidation == false; ) {
                Scanner in2 = new Scanner(System.in);
                System.out.print("You didn't enter an integer, please enter an integer: ");
                numberValidation = in2.hasNextInt();
                if (numberValidation == true) {
                    x1 = in2.nextInt();
                }
            }
        } else
            x1 = in1.nextInt();                              //x1 validation end


        Scanner in3 = new Scanner(System.in);                //y1 validation start
        System.out.print("Please, input y1 integer: ");
        numberValidation = in3.hasNextInt();

        if (numberValidation == false) {
            for (; numberValidation == false; ) {
                Scanner in4 = new Scanner(System.in);
                System.out.print("You didn't enter an integer, please enter an integer: ");
                numberValidation = in4.hasNextInt();
                if (numberValidation == true) {
                    y1 = in4.nextInt();
                }
            }
        } else
            y1 = in3.nextInt();                              //y1 validation end


        Scanner in5 = new Scanner(System.in);                //x2 validation start
        System.out.print("Please, input x2 integer: ");
        numberValidation = in5.hasNextInt();

        if (numberValidation == false) {
            for (; numberValidation == false; ) {
                Scanner in6 = new Scanner(System.in);
                System.out.print("You didn't enter an integer, please enter an integer: ");
                numberValidation = in6.hasNextInt();
                if (numberValidation == true) {
                    x2 = in6.nextInt();
                }
            }
        } else
            x2 = in5.nextInt();                              //x2 validation end


        Scanner in7 = new Scanner(System.in);                //y2 validation start
        System.out.print("Please, input y2 integer: ");
        numberValidation = in7.hasNextInt();

        if (numberValidation == false) {
            for (; numberValidation == false; ) {
                Scanner in8 = new Scanner(System.in);
                System.out.print("You didn't enter an integer, please enter an integer: ");
                numberValidation = in8.hasNextInt();
                if (numberValidation == true) {
                    y2 = in8.nextInt();
                }
            }
        } else
            y2 = in7.nextInt();                              //y2 validation end


        distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The length of the segment between the entered coordinates is equal to " + distance);

    }
}

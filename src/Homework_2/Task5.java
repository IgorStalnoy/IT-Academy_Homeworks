package Homework_2;

import java.util.Scanner;

public class Task5 {
    //Имеется прямоугольное отверстие размера a на b. Определить можно ли полностью закрыть отверстие круглой картонкой радиусом r
    //     Пример:
    //     6
    //     8
    //     5
    // Картонка с радиусом 5 закрывает полностью отверстие размера 6 * 8
    public static void main(String[] args) {

        int holeLength = 0, holeWight = 0, radius = 0;
        double holeHypotenuse;
        boolean numberValidation;

        Scanner in1 = new Scanner(System.in);                       //holeLength validation start
        System.out.print("Please input a holeLength positive integer: ");
        numberValidation = in1.hasNextInt();
        if (numberValidation == true) {
            holeLength = in1.nextInt();
            if (holeLength > 0) {
                numberValidation = true;
            } else
                numberValidation = false;
        }

        if (numberValidation == false) {
            for (; numberValidation == false; ) {
                Scanner in2 = new Scanner(System.in);
                System.out.print("You didn't enter a positive integer, please enter a positive integer: ");
                numberValidation = in2.hasNextInt();
                if (numberValidation == true) {
                    holeLength = in2.nextInt();
                    if (holeLength > 0) {
                        numberValidation = true;
                    } else {
                        numberValidation = false;
                    }

                }
            }
        }                                                          //holeLength validation start


        Scanner in3 = new Scanner(System.in);                       //holeWight validation start
        System.out.print("Please input a holeWight positive integer: ");
        numberValidation = in3.hasNextInt();
        if (numberValidation == true) {
            holeWight = in3.nextInt();
            if (holeWight > 0) {
                numberValidation = true;
            } else
                numberValidation = false;
        }

        if (numberValidation == false) {
            for (; numberValidation == false; ) {
                Scanner in4 = new Scanner(System.in);
                System.out.print("You didn't enter a positive integer, please enter a positive integer: ");
                numberValidation = in4.hasNextInt();
                if (numberValidation == true) {
                    holeWight = in4.nextInt();
                    if (holeWight > 0) {
                        numberValidation = true;
                    } else {
                        numberValidation = false;
                    }

                }
            }
        }                                                         //holeWight validation start

        Scanner in5 = new Scanner(System.in);                     //radius validation start
        System.out.print("Please input a radius positive integer: ");
        numberValidation = in5.hasNextInt();
        if (numberValidation == true) {
            radius = in5.nextInt();
            if (radius > 0) {
                numberValidation = true;
            } else
                numberValidation = false;
        }

        if (numberValidation == false) {
            for (; numberValidation == false; ) {
                Scanner in6 = new Scanner(System.in);
                System.out.print("You didn't enter a positive integer, please enter a positive integer: ");
                numberValidation = in6.hasNextInt();
                if (numberValidation == true) {
                    radius = in6.nextInt();
                    if (radius > 0) {
                        numberValidation = true;
                    } else {
                        numberValidation = false;
                    }

                }
            }
        }                                                         //radius validation start


        holeHypotenuse = Math.sqrt(holeLength * holeLength + holeWight * holeWight);
        if (holeHypotenuse / 2 <= radius) {
            System.out.println("The circle completely covers the hole");
        }
        else {
            System.out.println("Тhe circle does not cover the hole");
        }


    }
}

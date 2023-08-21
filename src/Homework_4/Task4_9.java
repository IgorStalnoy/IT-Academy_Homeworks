package Homework_4;

public class Task4_9 {
    //Для введенного целого числа определить является ли это число простым
    public static void main(String[] args) {

        Homework_4_Methods integerValidation = new Homework_4_Methods();
        int inputNumber = 0;
        boolean primeNumberCheck;
        while (inputNumber <= 1) {
            inputNumber = integerValidation.integerPositiveInputValidation();
            if (inputNumber <= 1) {
                System.out.println("Number should be greater than 1");
            }
        }

        for (int numbers = 2; numbers <= inputNumber; numbers++) {
            primeNumberCheck = inputNumber % numbers == 0 && numbers != inputNumber;
            if (primeNumberCheck) {
                System.out.println("This number is  not prime");
                break;
            }
            if (numbers == inputNumber) {
                System.out.println("This number is prime");
            }
        }

    }
}

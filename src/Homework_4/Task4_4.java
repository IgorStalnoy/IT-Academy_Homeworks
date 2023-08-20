package Homework_4;


public class Task4_4 {
    //Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры
    public static void main(String[] args) {

        Homework_4_Methods integerValidation = new Homework_4_Methods();
        System.out.print("To calculate the factorial, ");
        long factorial = 1;
        int inputNumber;
        do {
            inputNumber = integerValidation.integerPositiveInputValidation();
            if (inputNumber > 20) {
                System.out.println("The factorial for the given number is too large, please enter a number less");
            }
        } while (inputNumber > 20);

        for (int naturalNumbers = 1; naturalNumbers <= inputNumber; naturalNumbers++) {
            factorial = factorial * naturalNumbers;
        }

        System.out.println("(" + inputNumber + ")! = " + factorial);

    }
}

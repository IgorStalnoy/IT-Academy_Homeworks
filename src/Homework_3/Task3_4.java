package Homework_3;

public class Task3_4 {
    //Найти среднее число из трех, введенных с клавиатуры
    public static void main(String[] args) {

        Homework_3_Methods integerValidation = new Homework_3_Methods();
        int firstNumber, secondNumber, thirdNumber, averageNumber;
        System.out.println("You need to input 3 different integers. ");
        firstNumber = integerValidation.integerInput();

        do {
            secondNumber = integerValidation.integerInput();
            if (secondNumber == firstNumber) {
                System.out.println("The entered numbers must be different, please enter a different number");
            }
        } while (secondNumber == firstNumber);

        do {
            thirdNumber = integerValidation.integerInput();
            if (thirdNumber == firstNumber || thirdNumber == secondNumber) {
                System.out.println("The entered numbers must be different, please enter a different number");
            }
        } while (thirdNumber == firstNumber || thirdNumber == secondNumber);

        boolean firstNumberAverageCheck = (firstNumber > secondNumber && firstNumber < thirdNumber) || (firstNumber < secondNumber && firstNumber > thirdNumber);
        boolean secondNumberAverageCheck = (secondNumber > firstNumber && secondNumber < thirdNumber) || (secondNumber < firstNumber && secondNumber > thirdNumber);

        if (firstNumberAverageCheck) {
            averageNumber = firstNumber;
        } else if (secondNumberAverageCheck) {
            averageNumber = secondNumber;
        } else {
            averageNumber = thirdNumber;
        }

        System.out.println("Inputted numbers: " + firstNumber + " " + secondNumber + " " + thirdNumber);
        System.out.println("Average number: " + averageNumber);

    }
}

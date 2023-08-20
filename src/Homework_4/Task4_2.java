package Homework_4;


public class Task4_2 {
    //Найдите сумму и произведение цифр числа, введенного с клавиатуры
    public static void main(String[] args) {

        Homework_4_Methods integerValidation = new Homework_4_Methods();
        int inputNumber = Math.abs(integerValidation.integerInputValidation());
        int digitsSum = inputNumber % 10;
        int digitsMultiplication = inputNumber % 10;
        int lastDigit;
        boolean oneDigitCheck = inputNumber / 10 == 0;


        while (inputNumber / 10 != 0) {
            inputNumber = inputNumber / 10;
            lastDigit = inputNumber % 10;
            digitsSum = digitsSum + lastDigit;
            digitsMultiplication = digitsMultiplication * lastDigit;
        }

        System.out.println("The sum of the digits of the entered number: " + digitsSum);

        if (oneDigitCheck){
            System.out.println("The entered number has only one digit, at least 2 digits are required to multiply the digits");
        } else {
            System.out.println("The multiplication of the digits of the entered number: " + digitsMultiplication);
        }

    }
}

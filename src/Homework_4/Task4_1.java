package Homework_4;

public class Task4_1 {
    //Необходимо вывести на консоль такую последовательность чисел:
    //     1 2 4 8 16 32 64 128 256 512
    public static void main(String[] args) {

        double twoDigitDegree;
        int integerOutput;

        for (int degree = 0; degree <= 9; degree++) {
            twoDigitDegree = Math.pow(2, degree);
            integerOutput = (int) Math.round(twoDigitDegree);
            System.out.print(integerOutput + " ");
        }

    }
}

package Homework_4;

public class Task4_1 {
    //Необходимо вывести на консоль такую последовательность чисел:
    //     1 2 4 8 16 32 64 128 256 512
    public static void main(String[] args) {

        int factorVariable = 1;

        while (factorVariable <= 512) {
            System.out.print(factorVariable + " ");
            factorVariable *= 2;
        }

    }
}

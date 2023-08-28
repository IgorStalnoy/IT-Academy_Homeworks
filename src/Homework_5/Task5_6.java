package Homework_5;

public class Task5_6 {
    //Создать массив заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать.
    //  При перевороте элементов не создавать еще один массив
    public static void main(String[] args) {

        Homework_5_Methods arrayActions = new Homework_5_Methods();
        int[] randomArray = new int[15];
        arrayActions.fillingArrayWithRandomNumbers(randomArray);
        System.out.print("Random source");
        arrayActions.printArray(randomArray);

        System.out.print("Result invert");
        arrayActions.printInvertArray(randomArray);

    }
}

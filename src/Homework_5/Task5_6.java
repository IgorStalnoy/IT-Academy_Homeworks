package Homework_5;

public class Task5_6 {
    //Создать массив заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать.
    //  При перевороте элементов не создавать еще один массив
    public static void main(String[] args) {

        int[] randomArray = new int[11];
        ArrayUtils.fillArrayWithRandomNumbers(randomArray);
        System.out.print("Random source");
        ArrayUtils.printArray(randomArray);

        for (int i = 0; i < randomArray.length / 2; i++) {
            int temp = randomArray[i];
            randomArray[i] = randomArray[randomArray.length - i - 1];
            randomArray[randomArray.length - i - 1] = temp;
        }

        System.out.print("Result invert");
        ArrayUtils.printArray(randomArray);

    }
}

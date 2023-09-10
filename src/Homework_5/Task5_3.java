package Homework_5;

public class Task5_3 {
    //Выполнить слияние 2 упорядоченных массивов в один упорядоченный массив. Исходные массивы сортировать не нужно, они даны упорядоченными.
    //Итоговый массив должен быть упорядоченным сразу после слияния, без дополнительных сортировок.
    public static void main(String[] args) {
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        ArrayUtils.fillArrayWithOrderedNumbers(firstArray);
        ArrayUtils.fillArrayWithOrderedNumbers(secondArray);
        int resultArrayLength = firstArray.length + secondArray.length;
        int[] resultArray = new int[resultArrayLength];
        System.out.print("First");
        ArrayUtils.printArray(firstArray);
        System.out.print("Second");
        ArrayUtils.printArray(secondArray);

        int firstArrayPosition = 0;
        int secondArrayPosition = 0;

        if (firstArray.length > 0 && secondArray.length > 0) {
            int firstArrayMin = firstArray[firstArrayPosition];
            int secondArrayMin = secondArray[secondArrayPosition];
            for (int i = 0; i < resultArrayLength; i++) {
                if (firstArrayMin <= secondArrayMin && firstArrayPosition < firstArray.length || secondArrayPosition == secondArray.length) {
                    resultArray[i] = firstArrayMin;
                    firstArrayPosition++;
                    if (firstArrayPosition < firstArray.length) {
                        firstArrayMin = firstArray[firstArrayPosition];
                    }
                } else if (secondArrayMin <= firstArrayMin || firstArrayPosition == firstArray.length) {
                    resultArray[i] = secondArrayMin;
                    secondArrayPosition++;
                    if (secondArrayPosition < secondArray.length) {
                        secondArrayMin = secondArray[secondArrayPosition];
                    }
                }
            }
            System.out.print("Result");
            ArrayUtils.printArray(resultArray);
        } else if (firstArray.length == 0 && secondArray.length > 0) {
            System.out.print("Result");
            ArrayUtils.printArray(secondArray);
        } else if (firstArray.length > 0) {
            System.out.print("Result");
            ArrayUtils.printArray(firstArray);
        } else {
            System.out.print("Result");
            ArrayUtils.printArray(firstArray);
        }

    }
}

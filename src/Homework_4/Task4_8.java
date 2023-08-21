package Homework_4;

public class Task4_8 {
    //В городе N есть большой склад на котором существует 50000 различных полок. Для удобства работников руководство склада решило заказать для каждой полки
    // табличку с номером от 00001 до 50000 в местной типографии, но когда таблички напечатали, оказалось что печатный станок из-за неисправности не печатал
    // цифру 2, поэтому все таблички, в номерах которых содержалась одна или более двойка (например, 00002 или 20202) — надо перепечатывать. Напишите программу,
    // которая подсчитает сколько всего таких ошибочных табличек оказалось в бракованной партии.
    public static void main(String[] args) {

        int counter = 0;
        int digit, nameplateDefectCheck;

        for (int nameplateNumber = 1; nameplateNumber <= 50000; nameplateNumber++) {
            nameplateDefectCheck = nameplateNumber;
            while (nameplateDefectCheck != 0) {
                digit = nameplateDefectCheck % 10;
                if (digit == 2) {
                    counter++;
                    break;
                }
                nameplateDefectCheck = nameplateDefectCheck / 10;
            }
        }
        System.out.println("There are " + counter + " defective plates");

    }
}

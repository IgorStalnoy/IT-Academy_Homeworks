package Homework_6.Task_6_1;

public class Main {
    //Создайте класс с именем fraction, содержащий два поля типа int - числитель и знаменатель обыкновенной дроби.
    //Конструктор класса должен инициализировать их заданным набором значений.
    //Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;
    //метод, добавляющий (сложение) к текущей дроби дробь, переданную ему в параметре и возвращающий дробь - результат сложения;
    //метод, умножающий (произведение) текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат умножения;
    //метод, делящий (деление) текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат деления.
    public static void main(String[] args) {

        Fraction fraction = new Fraction(7, 19);
        System.out.print("Source fraction: ");
        fraction.printFraction();

        Fraction secondFraction = fraction.addFractions(21, 4);
        System.out.print("\nSum with input fraction : ");
        secondFraction.printFraction();
        System.out.print("Sum with input fraction as decimal : ");
        secondFraction.printDecimal();

        secondFraction = fraction.multiplicateFractions(45.2512);
        System.out.print("\nMultiplication with input fraction : ");
        secondFraction.printFraction();
        System.out.print("Multiplication with input fraction as decimal : ");
        secondFraction.printDecimal();

        secondFraction = fraction.divideFractions(0.235689);
        System.out.print("\nDividing with input fraction : ");
        secondFraction.printFraction();
        System.out.print("Dividing with input fraction as decimal : ");
        secondFraction.printDecimal();

    }
}

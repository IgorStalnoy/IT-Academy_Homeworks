package Homework_6.Task_6_1;

class Fraction {

    private final int numerator;
    private final int denominator;


    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Fraction addFractions(int additionNumerator, int additionDenominator) {
        int calculateNumerator = this.numerator * additionDenominator;
        additionNumerator = additionNumerator * this.denominator + calculateNumerator;
        additionDenominator = additionDenominator * this.denominator;
        fractionReduction(additionNumerator, additionDenominator);
        return fractionReduction(additionNumerator, additionDenominator);
    }

    Fraction multiplicateFractions(double inputDouble) {
        int inputNumerator = convertDoubleToSimpleFraction(inputDouble).numerator;
        int inputDenominator = convertDoubleToSimpleFraction(inputDouble).denominator;
        inputNumerator = inputNumerator * this.numerator;
        inputDenominator = inputDenominator * this.denominator;
        return fractionReduction(inputNumerator, inputDenominator);
    }

    Fraction divideFractions(double inputDouble) {
        int inputNumerator = convertDoubleToSimpleFraction(inputDouble).denominator;
        int inputDenominator = convertDoubleToSimpleFraction(inputDouble).numerator;
        inputNumerator = inputNumerator * this.numerator;
        inputDenominator = inputDenominator * this.denominator;
        return fractionReduction(inputNumerator, inputDenominator);
    }

    void printFraction() {
        System.out.println(numerator + "/" + denominator);
    }

    void printDecimal() {
        System.out.printf("%5.2f\n", convertFractionIntoDouble());
    }

    private Fraction fractionReduction(int numerator, int denominator) {
        int maxInt = Math.max(numerator, denominator);
        for (int i = maxInt; i > 1; i--) {
            boolean divisionWithoutRemainder = numerator % i == 0 && denominator % i == 0;
            if (divisionWithoutRemainder) {
                numerator = numerator / i;
                denominator = denominator / i;
            }
        }
        return new Fraction(numerator, denominator);
    }

    private Fraction convertDoubleToSimpleFraction(double inputDouble) {
        int holePart = (int) inputDouble;
        int denominator = 10000;
        inputDouble = inputDouble % 1;
        int numerator = (int) (Math.round(inputDouble * denominator) + holePart * denominator);
        return fractionReduction(numerator, denominator);
    }

    private double convertFractionIntoDouble() {
        return (double) numerator / denominator;
    }
}
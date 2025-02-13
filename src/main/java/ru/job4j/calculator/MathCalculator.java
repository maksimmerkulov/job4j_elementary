package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double calculateTotal(double first, double second, double third, double fourth) {
        return sumAndMultiply(first, second)
                + subtractAndDivide(third, fourth);
    }

    public static void main(String[] args) {
        double result1 = sumAndMultiply(10, 20);
        System.out.println("Результат расчета суммы сложения и произведения двух чисел равен: "
                + result1);

        double result2 = subtractAndDivide(100, 20);
        System.out.println("Результат расчета суммы разности и деления двух чисел равен: "
                + result2);

        double totalResult = calculateTotal(10, 20, 100, 20);
        System.out.println("Результат расчета суммы всех операций равен: "
                + totalResult);
    }
}
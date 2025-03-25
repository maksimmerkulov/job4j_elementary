package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

/**
 * Класс MathCalculator предназначен для выполнения математических вычислений,
 * используя методы из MathFunction.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class MathCalculator {

    /**
     * Метод sumAndMultiply вычисляет сумму сложения и произведения двух чисел.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @return Сумма сложения и умножения.
     */
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    /**
     * Метод subtractAndDivide вычисляет сумму разности и деления двух чисел.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @return Сумма разности и деления (если second ≠ 0).
     */
    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    /**
     * Метод calculateTotal вычисляет сумму всех операций: сложения, умножения, вычитания и деления.
     *
     * @param first  Первое число (для сложения и умножения).
     * @param second Второе число (для сложения и умножения).
     * @param third  Третье число (для вычитания и деления).
     * @param fourth Четвертое число (для вычитания и деления).
     * @return Общая сумма всех операций.
     */
    public static double calculateTotal(double first, double second, double third, double fourth) {
        return sumAndMultiply(first, second)
                + subtractAndDivide(third, fourth);
    }

    /**
     * Метод main демонстрирует работу всех методов класса.
     */
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
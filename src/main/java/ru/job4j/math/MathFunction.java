package ru.job4j.math;

/**
 * Класс {@code MathFunction} предназначен для выполнения основных математических операций:
 * сложения, вычитания, умножения и деления.
 * Все операции выполняются с использованием чисел типа {@code double}.
 *
 * <p>Пример использования:</p>
 * <pre>
 *     double result1 = MathFunction.sum(10, 20); 30.0
 *     double result2 = MathFunction.subtract(20, 10); 10.0
 *     double result3 = MathFunction.multiply(10, 20); 200.0
 *     double result4 = MathFunction.divide(20, 10); 2.0
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-13
 */
public class MathFunction {

    /**
     * Метод {@code sum(double first, double second)} выполняет сложение двух чисел.
     *
     * @param first  Первое число для сложения.
     * @param second Второе число для сложения.
     * @return Сумма двух чисел.
     */
    public static double sum(double first, double second) {
        return first + second;
    }

    /**
     * Метод {@code subtract(double first, double second)} выполняет вычитание двух чисел.
     *
     * @param first  Уменьшаемое число.
     * @param second Вычитаемое число.
     * @return Разность чисел.
     */
    public static double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Метод {@code multiply(double first, double second)} выполняет умножение двух чисел.
     *
     * @param first  Первый множитель.
     * @param second Второй множитель.
     * @return Произведение двух чисел.
     */
    public static double multiply(double first, double second) {
        return first * second;
    }

    /**
     * Метод {@code divide(double first, double second)} выполняет деление двух чисел.
     *
     * @param first  Делимое число.
     * @param second Делитель.
     * @return Результат деления.
     * @throws IllegalArgumentException если второе число (делитель) равно нулю.
     */
    public static double divide(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("Ошибка: деление на ноль невозможно!");
        }
        return first / second;
    }
}
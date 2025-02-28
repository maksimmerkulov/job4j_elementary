package ru.job4j.math;

/**
 * Класс MathFunction выполняет основные математические операции.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathFunction {

    /**
     * Метод выполняет сложение двух чисел.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @return Сумма чисел.
     */
    public static double sum(double first, double second) {
        return first + second;
    }

    /**
     * Метод выполняет вычитание двух чисел.
     *
     * @param first  Уменьшаемое.
     * @param second Вычитаемое.
     * @return Разность чисел.
     */
    public static double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Метод выполняет умножение двух чисел.
     *
     * @param first  Первый множитель.
     * @param second Второй множитель.
     * @return Произведение чисел.
     */
    public static double multiply(double first, double second) {
        return first * second;
    }

    /**
     * Метод выполняет деление двух чисел.
     *
     * @param first  Делимое.
     * @param second Делитель.
     * @return Результат деления.
     * @throws IllegalArgumentException если деление на ноль.
     */
    public static double divide(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("Ошибка: деление на ноль невозможно!");
        }
        return first / second;
    }
}
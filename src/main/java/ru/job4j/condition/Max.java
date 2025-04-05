package ru.job4j.condition;

/**
 * Класс {@code Max} предоставляет методы для нахождения максимального значения среди двух, трех или четырех чисел.
 * <p>
 * Используется перегрузка методов для минимизации дублирования кода.
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-05
 */
public class Max {

    /**
     * Метод {@code max(double first, double second)} возвращает максимальное из двух чисел.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @return Наибольшее из двух чисел.
     */
    public double max(double first, double second) {
        return (first > second) ? first : second;
    }

    /**
     * Метод {@code max(double first, double second, double third)} возвращает максимальное из трех чисел,
     * используя перегруженный метод {@link #max(double, double)}.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @param third  Третье число.
     * @return Наибольшее из трех чисел.
     */
    public double max(double first, double second, double third) {
        return max(first, max(second, third));
    }

    /**
     * Метод {@code max(double first, double second, double third, double fourth)} возвращает максимальное
     * из четырех чисел, используя перегруженный метод {@link #max(double, double, double)}.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @param third  Третье число.
     * @param fourth Четвертое число.
     * @return Наибольшее из четырех чисел.
     */
    public double max(double first, double second, double third, double fourth) {
        return max(first, max(second, third, fourth));
    }
}
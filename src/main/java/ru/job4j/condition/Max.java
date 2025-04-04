package ru.job4j.condition;

/**
 * Класс {@code Max} предоставляет методы для нахождения максимального значения среди трех или четырех чисел.
 * <p>
 * Используется перегрузка методов для минимизации дублирования кода.
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-04
 */
public class Max {

    /**
     * Метод {@code max(double first, double second, double third)} возвращает максимальное из трех чисел.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @param third  Третье число.
     * @return Наибольшее из трех чисел.
     */
    public double max(double first, double second, double third) {
        return (first > second) ? ((first > third) ? first : third)
                : ((second > third) ? second : third);
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
        double temp = max(second, third, fourth);
        return (first > temp) ? first : temp;
    }
}
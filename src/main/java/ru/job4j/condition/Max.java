package ru.job4j.condition;

/**
 * Класс {@code Max} предоставляет методы для нахождения максимального значения среди двух, трех или четырех чисел.
 *
 * <p>Используется перегрузка методов для минимизации дублирования кода.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Max max = new Max();
 * double result2 = max.max(3, 7);
 * double result3 = max.max(3, 7, 5);
 * double result4 = max.max(3, 7, 5, 10);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 7.0
 * 7.0
 * 10.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Max {

    /**
     * Возвращает максимальное из двух чисел.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @return Наибольшее из двух чисел.
     */
    public double max(double first, double second) {
        return (first > second) ? first : second;
    }

    /**
     * Возвращает максимальное из трех чисел, используя перегруженный метод {@link #max(double, double)}.
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
     * Возвращает максимальное из четырех чисел, используя перегруженный метод {@link #max(double, double, double)}.
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
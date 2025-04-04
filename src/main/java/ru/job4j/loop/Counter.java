package ru.job4j.loop;

/**
 * Класс {@code Counter} предназначен для суммирования чисел в заданном диапазоне.
 *
 * <p>Содержит методы для подсчета суммы всех чисел и суммы только четных чисел.</p>
 *
 * <p>Пример использования:</p>
 * <pre>
 *     int totalSum = Counter.sum(1, 10); 55
 *     int evenSum = Counter.sumByEven(1, 10); 30
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-20
 */
public class Counter {

    /**
     * Метод {@code sum(int start, int finish)} вычисляет сумму всех чисел в диапазоне
     * от {@code start} до {@code finish}.
     *
     * @param start  Начальное число (включительно).
     * @param finish Конечное число (включительно).
     * @return Сумма всех чисел в указанном диапазоне.
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Метод {@code sumByEven(int start, int finish)} вычисляет сумму всех четных чисел в диапазоне
     * от {@code start} до {@code finish}.
     *
     * @param start  Начальное число (включительно).
     * @param finish Конечное число (включительно).
     * @return Сумма всех четных чисел в указанном диапазоне.
     */
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
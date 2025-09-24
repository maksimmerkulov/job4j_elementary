package ru.job4j.loop;

/**
 * Класс {@code Counter} предназначен для суммирования чисел
 * в заданном диапазоне.
 *
 * <p>Содержит методы для подсчета суммы всех чисел и суммы
 * только четных чисел.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int totalSum = Counter.sum(1, 10);
 * int evenSum = Counter.sumByEven(1, 10);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * totalSum = 55
 * evenSum = 30
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class Counter {

    /**
     * Вычисляет сумму всех чисел в диапазоне
     * от {@code start} до {@code finish}.
     *
     * @param start начальное число (включительно)
     * @param finish конечное число (включительно)
     * @return сумма всех чисел в указанном диапазоне
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Вычисляет сумму всех четных чисел в диапазоне
     * от {@code start} до {@code finish}.
     *
     * @param start начальное число (включительно)
     * @param finish конечное число (включительно)
     * @return сумма всех четных чисел в указанном диапазоне
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

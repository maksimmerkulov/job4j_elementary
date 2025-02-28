package ru.job4j.loop;

/**
 * Класс Counter выполняет суммирование чисел в заданном диапазоне.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Counter {

    /**
     * Метод считает сумму всех чисел в диапазоне от start до finish.
     *
     * @param start  Начальное число.
     * @param finish Конечное число.
     * @return Сумма всех чисел в диапазоне.
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Метод считает сумму всех четных чисел в диапазоне от start до finish.
     *
     * @param start  Начальное число.
     * @param finish Конечное число.
     * @return Сумма всех четных чисел в диапазоне.
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
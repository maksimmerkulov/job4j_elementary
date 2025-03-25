package ru.job4j.loop;

/**
 * Класс Counter предназначен для суммирования чисел в заданном диапазоне.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Counter {

    /**
     * Метод sum считает сумму всех чисел в диапазоне от start до finish.
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
     * Метод sumByEven считает сумму всех четных чисел в диапазоне от start до finish.
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
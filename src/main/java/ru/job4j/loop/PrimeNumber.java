package ru.job4j.loop;

/**
 * Класс {@code PrimeNumber} предназначен для подсчета количества простых чисел в заданном диапазоне.
 *
 * <p>Простое число — это натуральное число, которое больше 1 и делится только на 1 и само себя.</p>
 *
 * <p>Метод {@link #calc(int)} перебирает все числа от 2 до {@code finish} и проверяет их
 * на простоту, используя метод {@link CheckPrimeNumber#check(int)} из класса {@link CheckPrimeNumber}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-20
 */
public class PrimeNumber {

    /**
     * Метод {@code calc(int finish)} рассчитывает количество простых чисел в диапазоне
     * от 2 до {@code finish} включительно.
     *
     * <p>Число 1 не является простым, поэтому оно не учитывается при подсчете.</p>
     *
     * @param finish Верхняя граница диапазона (включительно).
     * @return Количество простых чисел в диапазоне от 2 до {@code finish}.
     */
    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
package ru.job4j.loop;

/**
 * Класс PrimeNumber для подсчёта количества простых чисел от 2 до заданного числа.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PrimeNumber {

    /**
     * Метод рассчитывает количество простых чисел в диапазоне от 2 до finish включительно.
     * Число 1 не является простым, и оно не учитывается при подсчете.
     *
     * @param finish Число, до которого нужно посчитать простые числа.
     * @return Количество простых чисел от 2 до finish.
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
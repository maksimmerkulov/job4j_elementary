package ru.job4j.loop;

/**
 * Класс Factorial предназначен для вычисления факториала числа.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Factorial {

    /**
     * Метод calculate вычисляет факториал заданного числа.
     *
     * @param number Число, факториал которого нужно вычислить (>= 0).
     * @return Факториал числа.
     */
    public static int calculate(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}

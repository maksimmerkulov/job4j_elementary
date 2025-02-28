package ru.job4j.loop;

/**
 * Класс Factorial вычисляет факториал числа.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Factorial {

    /**
     * Метод вычисляет факториал заданного числа.
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

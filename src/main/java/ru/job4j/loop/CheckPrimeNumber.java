package ru.job4j.loop;

/**
 * Класс CheckPrimeNumber содержит метод, который определяет, является ли заданное число простым.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class CheckPrimeNumber {

    /**
     * Метод check проверяет, является ли переданное число простым.
     *
     * @param number Число для проверки.
     * @return Значение true, если число простое, иначе false.
     */
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}

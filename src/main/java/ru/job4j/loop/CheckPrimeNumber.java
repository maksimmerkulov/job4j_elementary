package ru.job4j.loop;

/**
 * Класс CheckPrimeNumber проверяет, является ли число простым.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class CheckPrimeNumber {

    /**
     * Метод проверяет, является ли переданное число простым.
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

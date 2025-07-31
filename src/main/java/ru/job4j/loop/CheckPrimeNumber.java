package ru.job4j.loop;

/**
 * Provides prime number verification.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class CheckPrimeNumber {

    /**
     * Checks if the number is prime.
     *
     * @param number value to check
     * @return {@code true} if the number is prime, {@code false} otherwise
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

package ru.job4j.loop;

/**
 * A utility class providing a method for prime number checking.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class CheckPrimeNumber {

    /**
     * Checks if the specified number is prime.
     *
     * @param number the number to check
     * @return {@code true} if the number is prime, {@code false} otherwise
     */
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

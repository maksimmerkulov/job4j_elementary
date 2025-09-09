package ru.job4j.loop;

/**
 * Checks if a given number is prime.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class CheckPrimeNumber {

    /**
     * Checks if the {@code number} is prime.
     *
     * @param number the number to check
     * @return {@code true} if the number is prime, {@code false} otherwise
     */
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

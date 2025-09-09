package ru.job4j.loop;

/**
 * Calculates the quantity of prime numbers in a range.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PrimeNumber {

    /**
     * Calculates the count of prime numbers from {@code 2} to {@code finish}.
     *
     * @param finish the end of the range
     * @return the count of prime numbers
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

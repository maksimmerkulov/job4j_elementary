package ru.job4j.loop;

/**
 * Calculates the quantity of prime numbers in a range.
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @see CheckPrimeNumber
 */
public class PrimeNumber {

    /**
     * Calculates the quantity of prime numbers from {@code 2} to {@code finish}.
     *
     * <p>Uses {@link CheckPrimeNumber#check(int)} for verification.
     *
     * @param finish the upper bound of the range
     * @return the count of prime numbers found
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

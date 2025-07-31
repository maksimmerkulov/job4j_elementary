package ru.job4j.loop;

/**
 * Provides methods for calculating sums in a range.
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class Counter {

    /**
     * Calculates the sum of all numbers in the range.
     *
     * @param start starting value
     * @param finish ending value
     * @return the sum of all numbers
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Calculates the sum of even numbers in the range.
     *
     * @param start starting value
     * @param finish ending value
     * @return the sum of even numbers
     */
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

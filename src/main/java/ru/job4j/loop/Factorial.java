package ru.job4j.loop;

/**
 * Calculates the factorial of a given number.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Factorial {

    /**
     * Calculates the factorial of the {@code number}.
     *
     * @param number the number to calculate factorial for
     * @return the factorial of the {@code number}
     */
    public static int calculate(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}

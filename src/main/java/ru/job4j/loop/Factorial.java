package ru.job4j.loop;

/**
 * Calculates the factorial of a number.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Factorial {

    /**
     * Calculates the factorial.
     *
     * @param number value to calculate
     * @return the resulting factorial
     */
    public static int calculate(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}

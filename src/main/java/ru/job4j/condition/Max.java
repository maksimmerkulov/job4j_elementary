package ru.job4j.condition;

/**
 * Provides methods to find the maximum value among numbers.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Max {

    /**
     * Finds the maximum of two numbers.
     *
     * @param first the first number
     * @param second the second number
     * @return the maximum value
     */
    public double max(double first, double second) {
        return (first > second) ? first : second;
    }

    /**
     * Finds the maximum of three numbers.
     *
     * @param first the first number
     * @param second the second number
     * @param third the third number
     * @return the maximum value
     */
    public double max(double first, double second, double third) {
        return max(first, max(second, third));
    }

    /**
     * Finds the maximum of four numbers.
     *
     * @param first the first number
     * @param second the second number
     * @param third the third number
     * @param fourth the fourth number
     * @return the maximum value
     */
    public double max(double first, double second, double third,
                      double fourth) {
        return max(first, max(second, third, fourth));
    }
}

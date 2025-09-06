package ru.job4j.math;

/**
 * Mathematical operations for two numbers.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathFunction {

    /**
     * Calculates the sum of two numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @return the addition result
     */
    public static double sum(double first, double second) {
        return first + second;
    }

    /**
     * Calculates the difference of two numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @return the subtraction result
     */
    public static double minus(double first, double second) {
        return first - second;
    }

    /**
     * Calculates the product of two numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @return the multiplication result
     */
    public static double multiply(double first, double second) {
        return first * second;
    }

    /**
     * Calculates the quotient of two numbers.
     *
     * @param first  the dividend
     * @param second the divisor
     * @return the division result
     */
    public static double divide(double first, double second) {
        return first / second;
    }
}

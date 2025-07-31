package ru.job4j.math;

/**
 * Provides basic mathematical operations.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class MathFunction {

    /**
     * Calculates the sum of two numbers.
     *
     * @param first the first operand
     * @param second the second operand
     * @return the sum of {@code first} and {@code second}
     */
    public static double sum(double first, double second) {
        return first + second;
    }

    /**
     * Calculates the difference between two numbers.
     *
     * @param first the first operand
     * @param second the second operand
     * @return the result of subtracting {@code second} from {@code first}
     */
    public static double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Calculates the product of two numbers.
     *
     * @param first the first operand
     * @param second the second operand
     * @return the product of {@code first} and {@code second}
     */
    public static double multiply(double first, double second) {
        return first * second;
    }

    /**
     * Calculates the quotient of two numbers.
     *
     * @param first the dividend
     * @param second the divisor
     * @return the result of dividing {@code first} by {@code second}
     * @throws IllegalArgumentException if {@code second} is zero
     */
    public static double divide(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException(
                    "Division by zero is not allowed"
            );
        }
        return first / second;
    }
}

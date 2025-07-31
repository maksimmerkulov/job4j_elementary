package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

/**
 * Provides complex mathematical calculations by combining basic operations.
 *
 * <p>Example output:
 * <pre>{@code
 * Result of sum and multiply: 230.0
 * Result of subtract and divide: 85.0
 * Total result of all operations: 315.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @see ru.job4j.math.MathFunction
 */
public class MathCalculator {

    /**
     * Calculates the sum of addition and multiplication results.
     *
     * @param first the first operand
     * @param second the second operand
     * @return the sum of addition and multiplication results
     */
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    /**
     * Calculates the sum of subtraction and division results.
     *
     * @param first the first operand
     * @param second the second operand
     * @return the sum of subtraction and division results
     */
    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    /**
     * Calculates the total result of all operations.
     *
     * @param first the first operand
     * @param second the second operand
     * @param third the third operand
     * @param fourth the fourth operand
     * @return the total sum
     */
    public static double calculateTotal(double first, double second,
                                        double third, double fourth) {
        return sumAndMultiply(first, second)
                + subtractAndDivide(third, fourth);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(
                "Result of sum and multiply: " + sumAndMultiply(10, 20)
        );
        System.out.println(
                "Result of subtract and divide: " + subtractAndDivide(100, 20)
        );
        System.out.println(
                "Total result of all operations: "
                        + calculateTotal(10, 20, 100, 20)
        );
    }
}

package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

/**
 * Calculation of combined math functions.
 *
 * <p>Example output for {@code first = 10, second = 20}:
 * <pre>{@code
 * Addition and multiplication: 230.0
 * Subtraction and division: -9.5
 * Total: 220.5
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathCalculator {

    /**
     * Calculates the sum of addition and multiplication.
     *
     * @param first  the first number
     * @param second the second number
     * @return the combined result
     */
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    /**
     * Calculates the sum of subtraction and division.
     *
     * @param first  the first number
     * @param second the second number
     * @return the combined result
     */
    public static double minusAndDivide(double first, double second) {
        return minus(first, second) + divide(first, second);
    }

    /**
     * Calculates the sum of all four math operations.
     *
     * @param first  the first number
     * @param second the second number
     * @return the total result
     */
    public static double totalSum(double first, double second) {
        return sum(first, second)
                + minus(first, second)
                + multiply(first, second)
                + divide(first, second);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println("Addition and multiplication: "
                + sumAndMultiply(10, 20));
        System.out.println("Subtraction and division: "
                + minusAndDivide(10, 20));
        System.out.println("Total: " + totalSum(10, 20));
    }
}

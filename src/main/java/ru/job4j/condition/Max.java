package ru.job4j.condition;

/**
 * Provides methods to find the maximum among numbers.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Max {

    /**
     * Finds the maximum of two numbers.
     *
     * @param left  the first number
     * @param right the second number
     * @return the maximum number
     */
    public int max(int left, int right) {
        return left > right ? left : right;
    }

    /**
     * Finds the maximum of three numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @param third  the third number
     * @return the maximum number
     */
    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    /**
     * Finds the maximum of four numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @param third  the third number
     * @param fourth the fourth number
     * @return the maximum number
     */
    public int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }
}

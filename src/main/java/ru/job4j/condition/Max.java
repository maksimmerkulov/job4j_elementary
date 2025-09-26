package ru.job4j.condition;

/**
 * A utility for finding the maximum value among numbers.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Max {

    /**
     * Returns the maximum of two numbers.
     *
     * @param left  the first number
     * @param right the second number
     * @return the maximum value
     */
    public int max(int left, int right) {
        return left > right ? left : right;
    }

    /**
     * Returns the maximum of three numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @param third  the third number
     * @return the maximum value
     */
    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    /**
     * Returns the maximum of four numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @param third  the third number
     * @param fourth the fourth number
     * @return the maximum value
     */
    public int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }
}

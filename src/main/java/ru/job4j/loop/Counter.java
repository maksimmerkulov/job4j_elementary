package ru.job4j.loop;

/**
 * A utility class that calculates the sum of a range of numbers.
 *
 * <p>Example output:
 * <pre>{@code
 * 55
 * 33
 * 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Counter {

    /**
     * Calculates the sum of numbers from {@code start} to {@code finish}.
     *
     * @param start  the start of the range
     * @param finish the end of the range
     * @return the sum of the range
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}

package ru.job4j.loop;

/**
 * Calculates the sum of a range of numbers.
 *
 * <p>Example output for {@code start = 0, finish = 10}:
 * <pre>{@code
 * 55
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Counter {

    /**
     * Calculates the sum of numbers from {@code start} to {@code finish}.
     *
     * @param start  start of the range
     * @param finish end of the range
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

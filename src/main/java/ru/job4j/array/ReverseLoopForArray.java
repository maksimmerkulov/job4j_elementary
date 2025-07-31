package ru.job4j.array;

/**
 * Demonstrates how to iterate over an array in reverse order.
 *
 * <p>Example output:
 * <pre>{@code
 * Array elements in reverse order:
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ReverseLoopForArray {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Array elements in reverse order: ");
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[numbers.length - i - 1];
            System.out.println(element);
        }
    }
}

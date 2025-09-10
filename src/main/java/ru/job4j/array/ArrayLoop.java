package ru.job4j.array;

/**
 * Fills an array using a linear function and prints its elements.
 *
 * <p>Example output:
 * <pre>{@code
 * 3
 * 5
 * 7
 * 9
 * 11
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ArrayLoop {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

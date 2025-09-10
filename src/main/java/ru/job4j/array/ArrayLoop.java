package ru.job4j.array;

/**
 * An entry point program that demonstrates filling an array and printing it
 * using an enhanced for-each loop.
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
 * @version 1.1
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
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

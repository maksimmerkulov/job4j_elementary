package ru.job4j.array;

/**
 * Demonstrates the usage of the enhanced for-loop (for-each) with an array.
 *
 * <p>Example output:
 * <pre>{@code
 * one
 * two
 * three
 * four
 * five
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ForEachUsage {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four", "five"};
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}

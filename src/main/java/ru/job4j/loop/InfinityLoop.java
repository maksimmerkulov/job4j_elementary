package ru.job4j.loop;

/**
 * Demonstrates an infinite loop by printing "infinity" to the console.
 *
 * <p>Example output:
 * <pre>{@code
 * infinity
 * infinity
 * ...
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class InfinityLoop {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("infinity");
            i = i - 1;
        }
    }
}

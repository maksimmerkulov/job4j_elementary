package ru.job4j.loop;

/**
 * Prints numbers in a specific range to the console.
 *
 * <p>Example output:
 * <pre>{@code
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class LoopFor {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

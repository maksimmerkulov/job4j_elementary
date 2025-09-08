package ru.job4j.loop;

/**
 * Prints the string "Forever" to the console ten times.
 *
 * <p>Example output:
 * <pre>{@code
 * Forever
 * Forever
 * ...
 * Forever
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Forever {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Forever");
        }
    }
}

package ru.job4j.loop;

/**
 * Demonstrates the use of the modulo operator to check if numbers are even.
 *
 * <p>Example output:
 * <pre>{@code
 * true
 * false
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Remain {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int ten = 10;
        boolean even = ten % 2 == 0;
        System.out.println(even);
        int nine = 9;
        boolean notEven = nine % 2 == 0;
        System.out.println(notEven);
    }
}

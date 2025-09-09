package ru.job4j.loop;

/**
 * An entry point program that demonstrates the income growth simulation.
 *
 * <p>Example output:
 * <pre>{@code
 * 0
 * 10
 * ...
 * 90
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Income {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int income = 0;
        while (income < 100) {
            System.out.println(income);
            income += 10;
        }
    }
}

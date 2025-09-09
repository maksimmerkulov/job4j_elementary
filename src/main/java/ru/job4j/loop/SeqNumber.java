package ru.job4j.loop;

/**
 * A mathematical utility class that calculates if a number can be represented
 * as a sum of sequential integers.
 *
 * <p>Example output:
 * <pre>{@code
 * 1
 * 3
 * 6
 * N = 6. Success
 * 1
 * 3
 * 6
 * N = 5. Not possible
 * 1
 * 3
 * N = 3. Success
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SeqNumber {

    /**
     * Calculates the sequence sum and checks if it matches {@code n}.
     *
     * @param n the target number
     */
    public static void calc(int n) {
        int hold = 0;
        for (int index = 1; index <= n; index++) {
            hold += index;
            System.out.println(hold);
            if (hold == n) {
                System.out.println("N = " + n + ". Success");
                break;
            } else if (hold > n) {
                System.out.println("N = " + n + ". Not possible");
                break;
            }
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        calc(6);
        calc(5);
        calc(3);
    }
}

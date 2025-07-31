package ru.job4j.loop;

/**
 * Calculates if a number can be represented as a sum of consecutive integers.
 *
 * <p>Example output for {@code n = 6}:
 * <pre>{@code
 * 1
 * 3
 * 6
 * N = 6. Success
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SeqNumber {

    /**
     * Calculates the sum of sequence and checks against the target.
     *
     * @param n the target number to check
     */
    public static void calc(int n) {
        int hold = 0;
        for (int i = 1; i <= n; i++) {
            hold += i;
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

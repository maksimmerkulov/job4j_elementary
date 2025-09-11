package ru.job4j.array;

/**
 * Calculates square numbers for an array.
 *
 * <p>Example output for {@code bound = 4}:
 * <pre>{@code
 * 0
 * 1
 * 4
 * 9
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Square {

    /**
     * Calculates square numbers from {@code 0} to {@code bound - 1}.
     *
     * @param bound the number of elements
     * @return the array of square numbers
     */
    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 0; i < bound; i++) {
            result[i] = i * i;
        }
        return result;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

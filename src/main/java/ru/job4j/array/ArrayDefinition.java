package ru.job4j.array;

/**
 * Defines various arrays and prints their lengths to the console.
 *
 * <p>Example output:
 * <pre>{@code
 * The length of the ages array is: 10
 * The length of the surnames array is: 100500
 * The length of the prices array is: 40
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ArrayDefinition {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("The length of the ages array is: "
                + ages.length);
        System.out.println("The length of the surnames array is: "
                + surnames.length);
        System.out.println("The length of the prices array is: "
                + prices.length);
    }
}

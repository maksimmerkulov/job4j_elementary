package ru.job4j.array;

/**
 * Demonstrates basic array definitions and properties.
 *
 * <p>Example output:
 * <pre>{@code
 * The length of the ages array is: 10
 * The length of the surnames array is: 100500
 * The length of the prices array is: 40
 *
 * James Gosling
 * Patrick Naughton
 * Mike Sheridan
 * Chris Warth
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.4
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
        String[] names = new String[4];
        names[0] = "James Gosling";
        names[1] = "Patrick Naughton";
        names[2] = "Mike Sheridan";
        names[3] = "Chris Warth";
        System.out.println("The length of the ages array is: " + ages.length);
        System.out.println("The length of the surnames array is: "
                + surnames.length);
        System.out.println("The length of the prices array is: "
                + prices.length);
        System.out.println();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

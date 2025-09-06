package ru.job4j.calculator;

/**
 * Ideal weight calculation based on height.
 *
 * <p>Example output for {@code height = 187}:
 * <pre>{@code
 * Man 187 cm is 100.05 kg
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Fit {

    /**
     * Calculates the ideal weight for a man.
     *
     * @param height the height in centimeters
     * @return the ideal weight
     */
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    /**
     * Calculates the ideal weight for a woman.
     *
     * @param height the height in centimeters
     * @return the ideal weight
     */
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        short height = 187;
        double man = manWeight(height);
        System.out.println("Man 187 cm is " + man + " kg");
    }
}

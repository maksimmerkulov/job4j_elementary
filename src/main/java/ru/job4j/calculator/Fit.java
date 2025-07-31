package ru.job4j.calculator;

/**
 * Calculates ideal weight for men and women.
 *
 * <p>Example output:
 * <pre>{@code
 * Man 187 cm is 100.05 kg
 * Woman 162 cm is 59.8 kg
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Fit {

    /**
     * Calculates ideal weight for a man based on height.
     *
     * @param height height in centimeters
     * @return ideal weight in kilograms
     */
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    /**
     * Calculates ideal weight for a woman based on height.
     *
     * @param height height in centimeters
     * @return ideal weight in kilograms
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
        short manHeight = 187;
        short womanHeight = 162;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Man 187 cm is " + man + " kg");
        System.out.println("Woman 162 cm is " + woman + " kg");
    }
}

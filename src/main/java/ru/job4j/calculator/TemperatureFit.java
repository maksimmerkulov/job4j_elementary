package ru.job4j.calculator;

/**
 * Calculation of ideal storage temperatures.
 *
 * <p>Example output for {@code temperature = 10}:
 * <pre>{@code
 * Ideal temperature for fruits is 8.0°C
 * Ideal temperature for meat is 5.0°C
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class TemperatureFit {

    /**
     * Calculates the ideal temperature for storing fruits.
     *
     * @param temperature the current temperature
     * @return the ideal fruit temperature
     */
    public static double idealTemperatureForFruits(int temperature) {
        return temperature - 2.0;
    }

    /**
     * Calculates the ideal temperature for storing meat.
     *
     * @param temperature the current temperature
     * @return the ideal meat temperature
     */
    public static double idealTemperatureForMeat(int temperature) {
        return temperature - 5.0;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int temperature = 10;
        double fruitsTemp = idealTemperatureForFruits(temperature);
        double meatTemp = idealTemperatureForMeat(temperature);
        System.out.println(
                "Ideal temperature for fruits is " + fruitsTemp + "°C"
        );
        System.out.println(
                "Ideal temperature for meat is " + meatTemp + "°C"
        );
    }
}

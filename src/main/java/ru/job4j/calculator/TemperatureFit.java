package ru.job4j.calculator;

/**
 * Calculates ideal storage temperature for food products.
 *
 * <p>Example output:
 * <pre>{@code
 * Ideal temperature for fruits is 8.0°C
 * Ideal temperature for meat is 5.0°C
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class TemperatureFit {

    /**
     * Calculates ideal temperature for fruits based on ambient temperature.
     *
     * @param temperature current temperature in degrees Celsius
     * @return ideal storage temperature for fruits
     */
    public static double idealTemperatureForFruits(int temperature) {
        return temperature - 2.0;
    }

    /**
     * Calculates ideal temperature for meat based on ambient temperature.
     *
     * @param temperature current temperature in degrees Celsius
     * @return ideal storage temperature for meat
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
        double fruitsTemp = TemperatureFit
                .idealTemperatureForFruits(temperature);
        double meatTemp = TemperatureFit
                .idealTemperatureForMeat(temperature);
        System.out.println("Ideal temperature for fruits is "
                + fruitsTemp + "°C");
        System.out.println("Ideal temperature for meat is "
                + meatTemp + "°C");
    }
}

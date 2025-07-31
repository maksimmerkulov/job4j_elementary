package ru.job4j.converter;

/**
 * Currency converter utility class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Converter {

    /**
     * Converts rubles to euros.
     *
     * @param value amount in rubles
     * @return amount in euros
     */
    public static double rubleToEuro(double value) {
        return value / 90;
    }

    /**
     * Converts rubles to dollars.
     *
     * @param value amount in rubles
     * @return amount in dollars
     */
    public static double rubleToDollar(double value) {
        return value / 75;
    }
}

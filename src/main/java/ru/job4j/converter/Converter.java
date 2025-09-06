package ru.job4j.converter;

/**
 * Currency converter for Rubles to Euro and Dollars.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Converter {

    /**
     * Converts rubles to euros.
     *
     * @param value the amount in rubles
     * @return the amount in euros
     */
    public static double rubleToEuro(double value) {
        return value / 90;
    }

    /**
     * Converts rubles to dollars.
     *
     * @param value the amount in rubles
     * @return the amount in dollars
     */
    public static double rubleToDollar(double value) {
        return value / 75;
    }
}

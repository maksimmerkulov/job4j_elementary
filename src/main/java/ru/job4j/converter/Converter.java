package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        // Assuming the conversion rate is 1 Euro = 98.10 Rubles.
        return value / 98.10f;
    }

    public static float rubleToDollar(float value) {
        // Assuming the conversion rate is 1 Dollar = 94 Rubles.
        return value / 94;
    }
}

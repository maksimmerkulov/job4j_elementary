package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 98.10f;
    }

    public static float rubleToDollar(float value) {
        return value / 94;
    }
}

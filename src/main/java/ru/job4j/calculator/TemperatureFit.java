package ru.job4j.calculator;

public class TemperatureFit {

    public static double idealTemperatureForFruits(int temperature) {
        return temperature - 2.0;
    }

    public static double idealTemperatureForMeat(int temperature) {
        return temperature - 5.0;
    }

    public static void main(String[] args) {
        int temperature = 10;
        double fruitsTemp = TemperatureFit.idealTemperatureForFruits(temperature);
        double meatTemp = TemperatureFit.idealTemperatureForMeat(temperature);
        System.out.println("Ideal temperature for fruits is " + fruitsTemp + "°C");
        System.out.println("Ideal temperature for meat is " + meatTemp + "°C");
    }
}

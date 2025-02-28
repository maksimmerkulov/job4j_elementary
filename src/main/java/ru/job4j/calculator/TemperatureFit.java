package ru.job4j.calculator;

/**
 * Класс TemperatureFit рассчитывает идеальную температуру хранения продуктов.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class TemperatureFit {

    /**
     * Метод вычисляет идеальную температуру для хранения фруктов.
     *
     * @param temperature Текущая температура.
     * @return Идеальная температура хранения фруктов.
     */
    public static double idealTemperatureForFruits(int temperature) {
        return temperature - 2.0;
    }

    /**
     * Метод вычисляет идеальную температуру для хранения мяса.
     *
     * @param temperature Текущая температура.
     * @return Идеальная температура хранения мяса.
     */
    public static double idealTemperatureForMeat(int temperature) {
        return temperature - 5.0;
    }

    /**
     * Основной метод программы. Демонстрирует расчет оптимальных температур хранения.
     *
     * @param args аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        int temperature = 10;
        double fruitsTemp = TemperatureFit.idealTemperatureForFruits(temperature);
        double meatTemp = TemperatureFit.idealTemperatureForMeat(temperature);
        System.out.println("Ideal temperature for fruits is " + fruitsTemp + "°C");
        System.out.println("Ideal temperature for meat is " + meatTemp + "°C");
    }
}

package ru.job4j.calculator;

/**
 * Класс {@code TemperatureFit} предназначен для вычисления идеальной температуры хранения продуктов.
 * Поддерживаются расчеты для фруктов и мяса.
 *
 * <p>Пример использования:</p>
 * <pre>
 *     int currentTemperature = 10;
 *     double fruitStorageTemp = TemperatureFit.idealTemperatureForFruits(currentTemperature);
 *     double meatStorageTemp = TemperatureFit.idealTemperatureForMeat(currentTemperature);
 * </pre>
 *
 * <p>
 * Методы класса вычисляют температуру хранения для разных типов продуктов, уменьшая текущую температуру на фиксированное количество градусов:
 * для фруктов — на 2°C, для мяса — на 5°C.
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-14
 */
public class TemperatureFit {

    /**
     * Метод {@code idealTemperatureForFruits(int temperature)} вычисляет идеальную температуру для хранения фруктов.
     *
     * @param temperature Текущая температура в градусах Цельсия.
     * @return Идеальная температура хранения фруктов (на 2°C ниже текущей).
     */
    public static double idealTemperatureForFruits(int temperature) {
        return temperature - 2.0;
    }

    /**
     * Метод {@code idealTemperatureForMeat(int temperature)} вычисляет идеальную температуру для хранения мяса.
     *
     * @param temperature Текущая температура в градусах Цельсия.
     * @return Идеальная температура хранения мяса (на 5°C ниже текущей).
     */
    public static double idealTemperatureForMeat(int temperature) {
        return temperature - 5.0;
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует расчет оптимальных температур хранения.
     *
     * <p>Пример вывода:</p>
     * <pre>
     *     Ideal temperature for fruits is 8.0°C
     *     Ideal temperature for meat is 5.0°C
     * </pre>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        int temperature = 10;
        double fruitsTemp = TemperatureFit.idealTemperatureForFruits(temperature);
        double meatTemp = TemperatureFit.idealTemperatureForMeat(temperature);
        System.out.println("Ideal temperature for fruits is " + fruitsTemp + "°C");
        System.out.println("Ideal temperature for meat is " + meatTemp + "°C");
    }
}

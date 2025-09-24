package ru.job4j.calculator;

/**
 * Класс {@code TemperatureFit} предназначен для вычисления идеальной
 * температуры хранения продуктов. Поддерживаются расчеты для фруктов и мяса.
 *
 * <p>Методы класса вычисляют температуру хранения для разных типов продуктов,
 * уменьшая текущую температуру на фиксированное количество градусов:
 * для фруктов — на 2°C, для мяса — на 5°C.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int temperature = 10;
 * double fruitsTemp = TemperatureFit.idealTemperatureForFruits(temperature);
 * double meatTemp = TemperatureFit.idealTemperatureForMeat(temperature);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
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
     * Вычисляет идеальную температуру для хранения фруктов.
     *
     * @param temperature текущая температура в градусах Цельсия
     * @return идеальная температура хранения фруктов (на 2°C ниже текущей)
     */
    public static double idealTemperatureForFruits(int temperature) {
        return temperature - 2.0;
    }

    /**
     * Вычисляет идеальную температуру для хранения мяса.
     *
     * @param temperature текущая температура в градусах Цельсия
     * @return идеальная температура хранения мяса (на 5°C ниже текущей)
     */
    public static double idealTemperatureForMeat(int temperature) {
        return temperature - 5.0;
    }

    /**
     * Демонстрирует расчет оптимальных температур хранения.
     *
     * @param args аргументы командной строки (не используются)
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

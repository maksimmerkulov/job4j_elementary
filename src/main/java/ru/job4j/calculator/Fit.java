package ru.job4j.calculator;

/**
 * Класс {@code Fit} предназначен для вычисления идеального веса для мужчин и женщин.
 *
 * <p>Идеальный вес рассчитывается с использованием роста человека.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 *     short height = 187;
 *     double man = Fit.manWeight(height);
 *     System.out.println("Man 187 cm is " + man + " kg");
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Man 187 cm is 85.0 kg
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Fit {

    /**
     * Вычисляет идеальный вес для мужчины.
     *
     * @param height Рост в сантиметрах.
     * @return Идеальный вес в килограммах.
     */
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    /**
     * Вычисляет идеальный вес для женщины.
     *
     * @param height Рост в сантиметрах.
     * @return Идеальный вес в килограммах.
     */
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    /**
     * Демонстрирует расчет идеального веса для мужчины.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 cm is " + man + " kg");
    }
}
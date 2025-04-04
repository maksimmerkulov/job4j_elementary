package ru.job4j.calculator;

/**
 * Класс {@code Fit} предназначен для вычисления идеального веса для мужчин и женщин.
 * Идеальный вес рассчитывается с использованием роста человека.
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-14
 */
public class Fit {

    /**
     * Метод {@code manWeight(short height)} вычисляет идеальный вес для мужчины.
     *
     * @param height Рост в сантиметрах.
     * @return Идеальный вес в килограммах.
     */
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    /**
     * Метод {@code womanWeight(short height)} вычисляет идеальный вес для женщины.
     *
     * @param height Рост в сантиметрах.
     * @return Идеальный вес в килограммах.
     */
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует расчет идеального веса для мужчины.
     * <p>Пример использования:</p>
     * <pre>
     *     short height = 187;
     *     double man = Fit.manWeight(height);
     *     System.out.println("Man 187 cm is " + man + " kg");
     * </pre>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 cm is " + man + " kg");
    }
}
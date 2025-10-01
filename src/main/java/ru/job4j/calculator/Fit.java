package ru.job4j.calculator;

/**
 * Класс {@code Fit} вычисляет идеальный вес для мужчин и женщин.
 *
 * <p>Идеальный вес рассчитывается на основе роста человека.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * short height = 187;
 * double man = Fit.manWeight(height);
 * double woman = Fit.womanWeight(height);
 * System.out.println("Man 187 cm is " + man + " kg");
 * System.out.println("Woman 187 cm is " + woman + " kg");
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Man 187 cm is 85.0 kg
 * Woman 187 cm is 87.05 kg
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Fit {

    /**
     * Вычисляет идеальный вес для мужчины.
     *
     * @param height рост в сантиметрах
     * @return идеальный вес в килограммах
     */
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    /**
     * Вычисляет идеальный вес для женщины.
     *
     * @param height рост в сантиметрах
     * @return идеальный вес в килограммах
     */
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    /**
     * Демонстрирует расчет идеального веса для мужчины.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 cm is " + man + " kg");
    }
}

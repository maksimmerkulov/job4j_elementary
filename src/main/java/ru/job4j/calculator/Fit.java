package ru.job4j.calculator;

/**
 * Класс Fit вычисляет идеальный вес для мужчин и женщин.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Fit {

    /**
     * Метод вычисляет идеальный вес для мужчины.
     *
     * @param height Рост в сантиметрах.
     * @return Идеальный вес в килограммах.
     */
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    /**
     * Метод вычисляет идеальный вес для женщины.
     *
     * @param height Рост в сантиметрах.
     * @return Идеальный вес в килограммах.
     */
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    /**
     * Основной метод программы. Демонстрирует расчет идеального веса для мужчины.
     */
    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 cm is " + man + " kg");
    }
}
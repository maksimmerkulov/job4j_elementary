package ru.job4j.condition;

/**
 * Класс {@code Rectangle} предназначен для вычисления диагонали прямоугольника
 * по его длине и ширине с использованием теоремы Пифагора.
 *
 * <p>Формула расчёта:</p>
 * <pre>
 *     diagonal = sqrt(length² + width²)
 * </pre>
 *
 * <p>Пример использования:</p>
 * <pre>
 *     double result = Rectangle.diagonal(3, 4); 5.0
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-15
 */
public class Rectangle {

    /**
     * Метод {@code diagonal(double length, double width)} вычисляет длину диагонали прямоугольника
     * по его длине и ширине.
     *
     * <p>Используется теорема Пифагора:</p>
     * <pre>
     *     diagonal = sqrt(length² + width²)
     * </pre>
     *
     * @param length Длина прямоугольника (должна быть положительной).
     * @param width  Ширина прямоугольника (должна быть положительной).
     * @return Длина диагонали прямоугольника.
     */
    public static double diagonal(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует работу метода {@link #diagonal(double, double)}.
     *
     * <p>Пример вывода:</p>
     * <pre>
     *     Diagonal of rectangle with length 3 and width 4 is 5.0
     * </pre>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        double result = diagonal(3, 4);
        System.out.println("Diagonal of rectangle with length 3 and width 4 is " + result);
    }
}

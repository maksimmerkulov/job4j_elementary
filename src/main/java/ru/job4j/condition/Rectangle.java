package ru.job4j.condition;

/**
 * Класс {@code Rectangle} предназначен для вычисления диагонали прямоугольника
 * по его длине и ширине с использованием теоремы Пифагора.
 *
 * <p><b>Формула расчета:</b></p>
 * <pre>{@code
 * diagonal = sqrt(length^2 + width^2)
 * }</pre>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * double result = Rectangle.diagonal(3, 4);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Diagonal of rectangle with length 3 and width 4 is 5.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Rectangle {

    /**
     * Вычисляет длину диагонали прямоугольника по его длине и ширине.
     *
     * @param length Длина прямоугольника (должна быть положительной).
     * @param width  Ширина прямоугольника (должна быть положительной).
     * @return Длина диагонали прямоугольника.
     */
    public static double diagonal(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    /**
     * Демонстрирует работу метода {@link #diagonal(double, double)}.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        double result = diagonal(3, 4);
        System.out.println("Diagonal of rectangle with length 3 and width 4 is " + result);
    }
}
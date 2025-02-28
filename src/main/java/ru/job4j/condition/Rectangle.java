package ru.job4j.condition;

/**
 * Класс Rectangle вычисляет диагональ прямоугольника.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Rectangle {

    /**
     * Метод вычисляет диагональ прямоугольника по длине и ширине.
     *
     * @param length Длина прямоугольника.
     * @param width  Ширина прямоугольника.
     * @return Длина диагонали.
     */
    public static double diagonal(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    /**
     * Основной метод программы. Демонстрирует работу метода {@link #diagonal(double, double)}.
     */
    public static void main(String[] args) {
        double result = diagonal(3, 4);
        System.out.println("Diagonal of rectangle with length 3 and width 4 is " + result);
    }
}

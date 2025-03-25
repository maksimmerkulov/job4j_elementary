package ru.job4j.condition;

/**
 * Класс Rectangle предназначен для вычисления диагонали прямоугольника.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Rectangle {

    /**
     * Метод diagonal вычисляет диагональ прямоугольника по длине и ширине.
     *
     * @param length Длина прямоугольника.
     * @param width  Ширина прямоугольника.
     * @return Длина диагонали.
     */
    public static double diagonal(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    /**
     * Метод main демонстрирует работу метода diagonal.
     */
    public static void main(String[] args) {
        double result = diagonal(3, 4);
        System.out.println("Diagonal of rectangle with length 3 and width 4 is " + result);
    }
}

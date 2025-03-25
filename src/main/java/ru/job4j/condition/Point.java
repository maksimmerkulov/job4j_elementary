package ru.job4j.condition;

/**
 * Класс Point предназначен для вычисления расстояния между двумя точками на плоскости.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Point {

    /**
     * Метод distance вычисляет расстояние между двумя точками (x1, y1) и (x2, y2) в 2D пространстве.
     *
     * @param x1 Координата X первой точки.
     * @param y1 Координата Y первой точки.
     * @param x2 Координата X второй точки.
     * @param y2 Координата Y второй точки.
     * @return Расстояние между точками.
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Метод main демонстрирует работу метода distance.
     */
    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}

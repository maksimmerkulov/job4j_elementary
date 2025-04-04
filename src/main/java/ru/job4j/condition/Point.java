package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Класс {@code Point} предназначен для представления точки на двумерной плоскости
 * и вычисления расстояния до другой точки по формуле Евклидова расстояния.
 * <p>
 * Формула расчета расстояния между двумя точками (x1, y1) и (x2, y2):
 * {@code sqrt((x2 - x1)^2 + (y2 - y1)^2)}
 * </p>
 *
 * <p>Пример использования:</p>
 * <pre>
 *     Point a = new Point(0, 0);
 *     Point b = new Point(0, 2);
 *     double distance = a.distance(b);
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-04-03
 */
public class Point {

    /**
     * Поле {@code x} представляет координату X точки.
     * Доступно только внутри экземпляра класса.
     */
    private int x;

    /**
     * Поле {@code y} представляет координату Y точки.
     * Доступно только внутри экземпляра класса.
     */
    private int y;

    /**
     * Конструктор {@code Point(int first, int second)} создает объект {@link Point} с заданными координатами.
     *
     * @param first  Координата X.
     * @param second Координата Y.
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Метод {@code distance(Point that)} вычисляет Евклидово расстояние между текущей точкой и переданной в аргументе.
     *
     * @param that Другая точка, до которой вычисляется расстояние.
     * @return Расстояние между двумя точками.
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует работу метода {@link #distance(Point)}.
     * <p>
     * Создаются две точки и вычисляется расстояние между ними.
     * </p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        System.out.println(distance);
    }
}

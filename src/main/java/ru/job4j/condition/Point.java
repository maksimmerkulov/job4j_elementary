package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Класс {@code Point} предназначен для представления точки на двумерной или трехмерной плоскости
 * и вычисления расстояния до другой точки по формуле Евклидова расстояния.
 *
 * <p><b>Формула для 2D:</b></p>
 * <pre>{@code
 * sqrt((x2 - x1)^2 + (y2 - y1)^2)
 * }</pre>
 *
 * <p><b>Формула для 3D:</b></p>
 * <pre>{@code
 * sqrt((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2)
 * }</pre>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Point a = new Point(0, 0);
 * Point b = new Point(0, 2);
 * double distance = a.distance(b);
 *
 * Point c = new Point(1, 2, 3);
 * Point d = new Point(4, 5, 6);
 * double distance3d = c.distance3d(d);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Point[0, 0]
 * Point[0, 2]
 * Point[1, 2, 3]
 * Point[4, 5, 6]
 * 2.0
 * 5.196152422706632
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.4
 */
public class Point {

    /**
     * Координата X точки.
     */
    private int x;

    /**
     * Координата Y точки.
     */
    private int y;

    /**
     * Координата Z точки.
     */
    private int z;

    /**
     * Создает объект {@link Point} с заданными координатами.
     *
     * @param x Координата X.
     * @param y Координата Y.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Создает объект {@link Point} с заданными координатами.
     *
     * @param x Координата X.
     * @param y Координата Y.
     * @param z Координата Z.
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Вычисляет Евклидово расстояние между текущей точкой и переданной в аргументе в двухмерном пространстве.
     *
     * @param that Другая точка, до которой вычисляется расстояние.
     * @return Расстояние между двумя точками в 2D.
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Вычисляет Евклидово расстояние между текущей точкой и переданной в аргументе в трехмерном пространстве.
     *
     * @param that Другая точка, до которой вычисляется расстояние.
     * @return Расстояние между двумя точками в 3D.
     */
    public double distance3d(Point that) {
        return sqrt(
                pow(this.x - that.x, 2)
                        + pow(this.y - that.y, 2)
                        + pow(this.z - that.z, 2)
        );
    }

    /**
     * Выводит координаты точки в 2D в консоль в формате: {@code Point[x, y]}.
     */
    public void infoPoint2d() {
            System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    /**
     * Выводит координаты точки в 3D в консоль в формате: {@code Point[x, y, z]}.
     */
    public void infoPoint3d() {
            System.out.println("Point[" + this.x + ", " + this.y + ", " + this.z + "]");
    }

    /**
     * Демонстрирует использование методов {@link #distance(Point)} и {@link #distance3d(Point)}.
     *
     * <p>Создаются две точки в двумерном пространстве и две точки в трехмерном пространстве.
     * Вычисляется расстояние между точками в 2D и 3D, а затем выводятся результаты в консоль.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(1, 2, 3);
        Point d = new Point(4, 5, 6);
        a.infoPoint2d();
        b.infoPoint2d();
        c.infoPoint3d();
        d.infoPoint3d();
        double distance = a.distance(b);
        double distance3d = c.distance3d(d);
        System.out.println(distance);
        System.out.println(distance3d);
    }
}
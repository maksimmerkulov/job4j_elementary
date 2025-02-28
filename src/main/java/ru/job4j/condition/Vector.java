package ru.job4j.condition;

/**
 * Класс Vector выполняет сложение двух векторов в двумерном пространстве.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Vector {

    /**
     * Метод выполняет сложение двух векторов (x1, y1) и (x2, y2).
     *
     * @param x1 Координата X первого вектора.
     * @param y1 Координата Y первого вектора.
     * @param x2 Координата X второго вектора.
     * @param y2 Координата Y второго вектора.
     * @return Строка с результатом сложения в формате "(x, y)".
     */
    public static String addVectors(int x1, int y1, int x2, int y2) {
        int xResult = x1 + x2;
        int yResult = y1 + y2;
        return String.format("(%d, %d)", xResult, yResult);
    }

    /**
     * Основной метод программы. Демонстрирует работу метода {@link #addVectors(int, int, int, int)}.
     */
    public static void main(String[] args) {
        String result = addVectors(1, 2, 3, 4);
        System.out.println("result (1, 2) + (3, 4) = " + result);
    }
}

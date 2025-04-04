package ru.job4j.condition;

/**
 * Класс {@code Vector} предназначен для выполнения операций с векторами
 * в двумерном пространстве. В данный момент реализовано сложение двух векторов.
 *
 * <p>Пример использования:</p>
 * <pre>
 *     String result = Vector.addVectors(1, 2, 3, 4);
 *     System.out.println(result); "(4, 6)"
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-14
 */
public class Vector {

    /**
     * Метод {@code addVectors(int x1, int y1, int x2, int y2)} выполняет сложение двух векторов (x1, y1) и (x2, y2).
     *
     * <p>
     * Результатом является новый вектор (x, y), координаты которого вычисляются
     * как сумма соответствующих координат исходных векторов.
     * </p>
     *
     * <p>Пример:</p>
     * <pre>
     *     (1, 2) + (3, 4) → (4, 6)
     * </pre>
     *
     * @param x1 Координата X первого вектора.
     * @param y1 Координата Y первого вектора.
     * @param x2 Координата X второго вектора.
     * @param y2 Координата Y второго вектора.
     * @return Строка с результатом сложения в формате {@code "(x, y)"}.
     */
    public static String addVectors(int x1, int y1, int x2, int y2) {
        int xResult = x1 + x2;
        int yResult = y1 + y2;
        return String.format("(%d, %d)", xResult, yResult);
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует работу метода {@code addVectors(int x1, int y1, int x2, int y2)}.
     *
     * <p>Пример вывода:</p>
     * <pre>
     *     result (1, 2) + (3, 4) = (4, 6)
     * </pre>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        String result = addVectors(1, 2, 3, 4);
        System.out.println("result (1, 2) + (3, 4) = " + result);
    }
}

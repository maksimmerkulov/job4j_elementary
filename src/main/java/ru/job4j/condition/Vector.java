package ru.job4j.condition;

/**
 * Класс {@code Vector} предназначен для выполнения операций с векторами в двумерном пространстве.
 *
 * <p>Используется для выполнения арифметических операций над координатами двух векторов.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String result = Vector.addVectors(1, 2, 3, 4);
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * result (1, 2) + (3, 4) = (4, 6)
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Vector {

    /**
     * Выполняет сложение двух векторов {@code (x1, y1)} и {@code (x2, y2)}.
     *
     * <p>Результатом является новый вектор {@code (x, y)}, где:</p>
     * <pre>{@code
     * x = x1 + x2
     * y = y1 + y2
     * }</pre>
     *
     * @param x1 Координата X первого вектора.
     * @param y1 Координата Y первого вектора.
     * @param x2 Координата X второго вектора.
     * @param y2 Координата Y второго вектора.
     * @return Строка с результатом сложения в формате: {@code (x, y)}.
     */
    public static String addVectors(int x1, int y1, int x2, int y2) {
        int xResult = x1 + x2;
        int yResult = y1 + y2;
        return String.format("(%d, %d)", xResult, yResult);
    }

    /**
     * Демонстрирует работу метода {@code addVectors(int x1, int y1, int x2, int y2)}.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        String result = addVectors(1, 2, 3, 4);
        System.out.println("result (1, 2) + (3, 4) = " + result);
    }
}
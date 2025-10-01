package ru.job4j.array;

/**
 * Класс {@code MatrixSum} предназначен для вычисления суммы всех элементов
 * двумерного массива.
 *
 * <p><b>Основная функциональность:</b></p>
 * <ul>
 *     <li>Проход по всем элементам двумерного массива.</li>
 *     <li>Суммирование значений элементов массива.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[][] array = {
 *     {1, 2, 3},
 *     {4, 5},
 *     {6}
 * };
 * int result = MatrixSum.sum(array);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * result = 21
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class MatrixSum {

    /**
     * Вычисляет сумму всех элементов переданного двумерного массива.
     *
     * <p>Проходит по всем строкам и всем ячейкам внутри строки,
     * последовательно прибавляя каждое значение к результату.</p>
     *
     * @param array двумерный массив целых чисел
     * @return сумма всех элементов массива
     */
    public static int sum(int[][] array) {
        int result = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                result = result + array[row][cell];
            }
        }
        return result;
    }
}

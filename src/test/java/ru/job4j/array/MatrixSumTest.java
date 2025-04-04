package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code MatrixSumTest} предназначен для проверки метода
 * {@link MatrixSum#sum(int[][])} из класса {@link MatrixSum}.
 * <p>
 * Включает тесты для следующих случаев:
 * <ul>
 *     <li>Массив с одним элементом.</li>
 *     <li>Квадратный массив 2×2.</li>
 *     <li>Прямоугольный массив с различными значениями.</li>
 * </ul>
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-28
 */
public class MatrixSumTest {

    /**
     * Тестирует метод {@link MatrixSum#sum(int[][])} на массиве, содержащем один элемент.
     */
    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        int result = MatrixSum.sum(array);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тестирует метод {@link MatrixSum#sum(int[][])} на квадратном массиве 2×2.
     */
    @Test
    public void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int result = MatrixSum.sum(array);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тестирует метод {@link MatrixSum#sum(int[][])} на прямоугольном массиве с разными значениями.
     */
    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int result = MatrixSum.sum(array);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}
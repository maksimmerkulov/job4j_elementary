package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code SkipNegativeTest} предназначен для проверки метода
 * {@link SkipNegative#skip(int[][])} в классе {@link SkipNegative}.
 * <p>
 * Проверяются различные сценарии, включая:
 * <ul>
 *     <li>Массив с одинаковым числом строк и столбцов.</li>
 *     <li>Массив с разным количеством элементов в строках.</li>
 *     <li>Массив, не содержащий отрицательных чисел.</li>
 *     <li>Массив, состоящий только из отрицательных чисел.</li>
 *     <li>Пустой массив.</li>
 * </ul>
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-28
 */
public class SkipNegativeTest {

    /**
     * Тест проверяет массив размером 2x2, содержащий отрицательные элементы.
     * Отрицательные элементы должны замениться на 0.
     */
    @Test
    public void whenArrayRowAndColumnEquals() {
        int[][] array = {
                {1, -2},
                {1, 2}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    /**
     * Тест проверяет массив с разной длиной строк, содержащий отрицательные числа.
     * Все отрицательные числа должны быть заменены на 0.
     */
    @Test
    public void whenArrayRow4AndColumnNotEquals() {
        int[][] array = {
                {1, -2},
                {1, 2, -3},
                {1, -2, 3, -4},
                {1, 2, -3, -4, 5}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2, 0},
                {1, 0, 3, 0},
                {1, 2, 0, 0, 5}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    /**
     * Тест проверяет массив, который уже не содержит отрицательных чисел.
     * Ожидается, что массив останется неизменным.
     */
    @Test
    public void whenArrayHasNoNegativeNumbers() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    /**
     * Тест проверяет массив, состоящий только из отрицательных чисел.
     * Ожидается, что все числа заменятся на 0.
     */
    @Test
    public void whenArrayHasOnlyNegativeNumbers() {
        int[][] array = {
                {-1, -2, -3},
                {-4, -5, -6}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {0, 0, 0},
                {0, 0, 0}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    /**
     * Тест проверяет случай пустого массива.
     * Ожидается, что метод корректно обработает этот случай без ошибок.
     */
    @Test
    public void whenArrayIsEmpty() {
        int[][] array = {};
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {};
        assertThat(result).isDeepEqualTo(expected);
    }
}
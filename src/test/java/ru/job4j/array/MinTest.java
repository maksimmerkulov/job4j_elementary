package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code MinTest} предназначен для проверки метода {@link Min#findMin(int[])} в классе {@link Min}.
 * <p>
 * Проверяет корректность работы метода на различных входных данных, таких как минимальный элемент в начале,
 * середине и конце массива.
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-28
 */
public class MinTest {

    /**
     * Тест проверяет, что метод {@link Min#findMin(int[])} корректно определяет минимальное значение,
     * если оно находится в начале массива.
     */
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 5, 10};
        int result = Min.findMin(array);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тест проверяет, что метод {@link Min#findMin(int[])} корректно определяет минимальное значение,
     * если оно находится в конце массива.
     */
    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3};
        int result = Min.findMin(array);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тест проверяет, что метод {@link Min#findMin(int[])} корректно определяет минимальное значение,
     * если оно находится в середине массива.
     */
    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}
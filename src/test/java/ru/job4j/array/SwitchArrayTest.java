package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code SwitchArrayTest} проверяет корректность работы методов
 * {@link SwitchArray#swap(int[], int, int)}
 * и {@link SwitchArray#swapBorder(int[])} класса {@link SwitchArray}.
 *
 * <p>Методы тестируют перестановку элементов в массиве, включая граничные
 * случаи.</p>
 *
 * <p>Проверяется, что после выполнения методов массив содержит ожидаемые
 * значения.</p>
 *
 * <p><b>Примеры тестирования:</b></p>
 * <pre>{@code
 * int[] input = {1, 2, 3, 4};
 * int[] result = SwitchArray.swapBorder(input);
 * int[] expected = {4, 2, 3, 1};
 * assertThat(result).containsExactly(expected);
 *
 * int[] input = {1, 2, 3, 4};
 * int source = 0;
 * int destination = 3;
 * int[] result = SwitchArray.swap(input, source, destination);
 * int[] expected = {4, 2, 3, 1};
 * assertThat(result).containsExactly(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class SwitchArrayTest {

    /**
     * Проверяет {@link SwitchArray#swapBorder(int[])} на массиве длиной 4.
     */
    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет {@link SwitchArray#swapBorder(int[])} на массиве длиной 6.
     */
    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет {@link SwitchArray#swapBorder(int[])} на массиве длиной 3.
     */
    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = {1, 2, 3};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет {@link SwitchArray#swapBorder(int[])} на массиве из одного
     * элемента.
     */
    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет {@link SwitchArray#swap(int[], int, int)} при перестановке
     * первого и последнего элементов в массиве длиной 4.
     */
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = 3;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет {@link SwitchArray#swap(int[], int, int)} при перестановке
     * элементов по индексам 1 и 2 в массиве длиной 3.
     */
    @Test
    void whenSwap1to2() {
        int[] input = {5, 9, 7};
        int source = 1;
        int destination = 2;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {5, 7, 9};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет {@link SwitchArray#swap(int[], int, int)} при перестановке
     * элементов 2 и 4 в массиве длиной 5.
     */
    @Test
    void whenSwap2to4() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 2;
        int destination = 4;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 5, 4, 3};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет {@link SwitchArray#swap(int[], int, int)} при перестановке
     * элементов 4 и 6 в массиве длиной 7.
     */
    @Test
    void whenSwap4to6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 4;
        int destination = 6;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 3, 4, 7, 6, 5};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет {@link SwitchArray#swap(int[], int, int)} при перестановке
     * элементов 3 и 4 в массиве длиной 7.
     */
    @Test
    void whenSwap3to4() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 3;
        int destination = 4;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 3, 5, 4, 6, 7};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет {@link SwitchArray#swap(int[], int, int)} при перестановке
     * первого и последнего элементов в массиве длиной 7.
     */
    @Test
    void whenSwap0to6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 0;
        int destination = 6;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {7, 2, 3, 4, 5, 6, 1};
        assertThat(result).containsExactly(expected);
    }
}

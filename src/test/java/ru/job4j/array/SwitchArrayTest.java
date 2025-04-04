package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code SwitchArrayTest} проверяет корректность работы методов {@link SwitchArray#swap(int[], int, int)}
 * и {@link SwitchArray#swapBorder(int[])} класса {@link SwitchArray}.
 *
 * <p>Методы тестируют перестановку элементов в массиве, включая граничные случаи.</p>
 * <p>Проверяется, что после выполнения методов массив содержит ожидаемые значения.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-25
 */
class SwitchArrayTest {

    /**
     * Тест метода {@link SwitchArray#swapBorder(int[])} на массиве из 4 элементов.
     * Ожидаемый результат: первый и последний элементы поменяются местами.
     */
    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Тест метода {@link SwitchArray#swapBorder(int[])} на массиве из 6 элементов.
     * Проверяется, что первый и последний элементы поменяются местами.
     */
    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Тест {@link SwitchArray#swapBorder(int[])} для массива из 3 элементов.
     * Ожидаемый результат: {3, 2, 1}.
     */
    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = {1, 2, 3};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Тест {@link SwitchArray#swapBorder(int[])} для массива из одного элемента.
     * Ожидаемый результат: массив остается без изменений.
     */
    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Тест метода {@link SwitchArray#swap(int[], int, int)} при перестановке
     * первого и последнего элемента в массиве из 4 элементов.
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
     * Тест метода {@link SwitchArray#swap(int[], int, int)}
     * при перестановке элементов по индексам 1 и 2.
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
     * Тест {@link SwitchArray#swap(int[], int, int)}
     * при перестановке элементов 2 и 4 в массиве из 5 элементов.
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
     * Тест метода {@link SwitchArray#swap(int[], int, int)}
     * при перестановке элементов 4 и 6 в массиве из 7 элементов.
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
     * Тест метода {@link SwitchArray#swap(int[], int, int)}
     * при перестановке элементов 3 и 4.
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
     * Тест метода {@link SwitchArray#swap(int[], int, int)}
     * при перестановке первого и последнего элементов.
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
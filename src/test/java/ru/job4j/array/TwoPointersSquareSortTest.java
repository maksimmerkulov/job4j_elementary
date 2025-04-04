package ru.job4j.array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Тест-класс {@code TwoPointersSquareSortTest} предназначен для проверки методов
 * {@link TwoPointersSquareSort#processArray(int[])}, {@link TwoPointersSquareSort#containsNegative(int[])},
 * {@link TwoPointersSquareSort#reverseArray(int[])} и {@link TwoPointersSquareSort#squareArray(int[])}
 * в классе {@link TwoPointersSquareSort}.
 * <p>
 * Этот класс проверяет корректность работы методов класса {@code TwoPointersSquareSort}, включая обработку массивов
 * с положительными и отрицательными числами, а также проверку правильности развертки и возведения в квадрат элементов.
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-03-24
 */
public class TwoPointersSquareSortTest {

    /**
     * Тестирует метод {@link TwoPointersSquareSort#processArray(int[])},
     * когда массив содержит отрицательные числа.
     * В данном случае происходит разворот массива, а затем возведение каждого элемента в квадрат.
     */
    @Test
    public void testProcessArrayWithNegative() {
        int[] input = {-3, 2, 1};
        int[] expected = {1, 4, 9};
        TwoPointersSquareSort.processArray(input);
        assertArrayEquals(expected, input);
    }

    /**
     * Тестирует метод {@link TwoPointersSquareSort#processArray(int[])},
     * когда массив не содержит отрицательных чисел.
     * В данном случае сначала происходит возведение каждого элемента в квадрат, а затем разворот массива.
     */
    @Test
    public void testProcessArrayWithoutNegative() {
        int[] input = {1, 2, 3};
        int[] expected = {9, 4, 1};
        TwoPointersSquareSort.processArray(input);
        assertArrayEquals(expected, input);
    }

    /**
     * Тестирует метод {@link TwoPointersSquareSort#processArray(int[])},
     * проверяя наличие отрицательных чисел в массиве.
     */
    @Test
    public void testContainsNegative() {
        int[] arrWithNegative = {-1, 0, 1};
        int[] arrWithoutNegative = {1, 2, 3};
        assertTrue(TwoPointersSquareSort.containsNegative(arrWithNegative));
        assertFalse(TwoPointersSquareSort.containsNegative(arrWithoutNegative));
    }

    /**
     * Тестирует метод {@link TwoPointersSquareSort#reverseArray(int[])},
     * проверяя корректность разворота массива.
     */
    @Test
    public void testReverseArray() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        TwoPointersSquareSort.reverseArray(input);
        assertArrayEquals(expected, input);
    }

    /**
     * Тестирует метод {@link TwoPointersSquareSort#squareArray(int[])},
     * проверяя возведение каждого элемента массива в квадрат.
     */
    @Test
    public void testSquareArray() {
        int[] input = {-2, -1, 0, 1, 2};
        int[] expected = {4, 1, 0, 1, 4};
        TwoPointersSquareSort.squareArray(input);
        assertArrayEquals(expected, input);
    }

    /**
     * Тестирует метод {@link TwoPointersSquareSort#processArray(int[])} с пустым массивом.
     * Ожидается, что результат будет также пустым.
     */
    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        TwoPointersSquareSort.processArray(input);
        assertArrayEquals(expected, input);
    }

    /**
     * Тестирует метод {@link TwoPointersSquareSort#processArray(int[])} с массивом,
     * состоящим из одного отрицательного элемента.
     */
    @Test
    public void testSingleElementArrayWithNegative() {
        int[] input = {-3};
        int[] expected = {9};
        TwoPointersSquareSort.processArray(input);
        assertArrayEquals(expected, input);
    }

    /**
     * Тестирует метод {@link TwoPointersSquareSort#processArray(int[])} с массивом,
     * состоящим из одного положительного элемента.
     */
    @Test
    public void testSingleElementArrayWithoutNegative() {
        int[] input = {3};
        int[] expected = {9};
        TwoPointersSquareSort.processArray(input);
        assertArrayEquals(expected, input);
    }
}

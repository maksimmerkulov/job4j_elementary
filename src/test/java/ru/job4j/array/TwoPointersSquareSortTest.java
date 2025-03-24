package ru.job4j.array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Тест-класс для проверки методов processArray, containsNegative, reverseArray и squareArray
 * в классе TwoPointersSquareSort.
 */
public class TwoPointersSquareSortTest {
    @Test
    public void testProcessArrayWithNegative() {
        int[] input = {-3, 2, 1};
        int[] expected = {1, 4, 9};
        TwoPointersSquareSort.processArray(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testProcessArrayWithoutNegative() {
        int[] input = {1, 2, 3};
        int[] expected = {9, 4, 1};
        TwoPointersSquareSort.processArray(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testContainsNegative() {
        int[] arrWithNegative = {-1, 0, 1};
        int[] arrWithoutNegative = {1, 2, 3};
        assertTrue(TwoPointersSquareSort.containsNegative(arrWithNegative));
        assertFalse(TwoPointersSquareSort.containsNegative(arrWithoutNegative));
    }

    @Test
    public void testReverseArray() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        TwoPointersSquareSort.reverseArray(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSquareArray() {
        int[] input = {-2, -1, 0, 1, 2};
        int[] expected = {4, 1, 0, 1, 4};
        TwoPointersSquareSort.squareArray(input);
        assertArrayEquals(expected, input);
    }
}

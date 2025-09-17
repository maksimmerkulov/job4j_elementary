package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link MatrixCheck} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class MatrixCheckTest {

    /**
     * Verifies that {@link MatrixCheck#monoHorizontal(char[][], int)}
     * returns {@code true}.
     */
    @Test
    void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    /**
     * Verifies that {@link MatrixCheck#monoHorizontal(char[][], int)}
     * returns {@code false}.
     */
    @Test
    void whenNoMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', ' ', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    /**
     * Verifies that {@link MatrixCheck#monoVertical(char[][], int)}
     * returns {@code true}.
     */
    @Test
    void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    /**
     * Verifies that {@link MatrixCheck#monoVertical(char[][], int)}
     * returns {@code false}.
     */
    @Test
    void whenNoMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isFalse();
    }

    /**
     * Verifies that {@link MatrixCheck#extractDiagonal(char[][])}
     * returns {@code 'X'} elements.
     */
    @Test
    void whenDiagonalFullX() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Verifies that {@link MatrixCheck#extractDiagonal(char[][])}
     * returns {@code '1'} elements.
     */
    @Test
    void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Verifies that {@link MatrixCheck#extractDiagonal(char[][])}
     * returns mixed elements.
     */
    @Test
    void whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
        assertThat(result).containsExactly(expected);
    }
}

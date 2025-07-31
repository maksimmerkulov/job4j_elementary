package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link MatrixCheck} class.
 *
 * @author Maksim Merkulov
 * @version 1.5
 */
class MatrixCheckTest {

    /**
     * Verifies that {@link MatrixCheck#monoHorizontal(char[][], int)}
     * returns {@code true} for a fully filled row with {@code 'X'}.
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
     * returns {@code false} if the row is not fully filled.
     */
    @Test
    void whenHasNotMonoHorizontal() {
        char[][] input = {
                {'X', ' ', ' '},
                {'X', 'X', ' '},
                {'X', 'X', 'X'},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    /**
     * Verifies that {@link MatrixCheck#monoVertical(char[][], int)}
     * returns {@code true} for a fully filled column with {@code 'X'}.
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
     * returns {@code false} if the column is not fully filled.
     */
    @Test
    void whenHasNotMonoVertical() {
        char[][] input = {
                {' ', 'X', 'X'},
                {' ', 'X', 'X'},
                {' ', 'X', ' '},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isFalse();
    }

    /**
     * Verifies that {@link MatrixCheck#extractDiagonal(char[][])}
     * correctly returns the main diagonal of the matrix.
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
     * correctly returns the main diagonal when all elements are {@code '1'}.
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
     * correctly returns the main diagonal when elements are mixed.
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

    /**
     * Verifies that {@link MatrixCheck#isWin(char[][])} returns {@code true}
     * for a vertical winning line.
     */
    @Test
    void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result).isTrue();
    }

    /**
     * Verifies that {@link MatrixCheck#isWin(char[][])} returns {@code false}
     * if no winning line exists.
     */
    @Test
    void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result).isFalse();
    }

    /**
     * Verifies {@link MatrixCheck#isWin(char[][])} returns {@code true}
     * for a horizontal winning line.
     */
    @Test
    void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result).isTrue();
    }

    /**
     * Verifies {@link MatrixCheck#isWin(char[][])} returns {@code false}
     * for a diagonal-only filled matrix without full row or column.
     */
    @Test
    void whenDataDiagMonoIsTrueThenFalse() {
        char[][] input = {
                {'X', ' ', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', ' ', 'X', ' '},
                {' ', ' ', ' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result).isFalse();
    }
}

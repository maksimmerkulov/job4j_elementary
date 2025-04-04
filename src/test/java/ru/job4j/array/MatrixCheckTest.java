package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code MatrixCheckTest} предназначен для проверки методов
 * {@link MatrixCheck#monoHorizontal(char[][], int)},
 * {@link MatrixCheck#monoVertical(char[][], int)},
 * {@link MatrixCheck#extractDiagonal(char[][])}
 * и {@link MatrixCheck#isWin(char[][])} в классе {@link MatrixCheck}.
 *
 * <p>Эти тесты проверяют корректность работы с двумерными массивами символов.</p>
 *
 * @author Maksim Merkulov
 * @version 1.4
 * @since 2025-03-01
 */
public class MatrixCheckTest {

    /**
     * Проверяет, что метод {@link MatrixCheck#monoHorizontal(char[][], int)}
     * правильно определяет строку, содержащую только символы 'X'.
     */
    @Test
    public void whenHasMonoHorizontal() {
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
     * Проверяет, что метод {@link MatrixCheck#monoHorizontal(char[][], int)}
     * корректно определяет строку, не состоящую только из символов 'X'.
     */
    @Test
    public void whenHasNotMonoHorizontal() {
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
     * Проверяет, что метод {@link MatrixCheck#monoVertical(char[][], int)}
     * правильно определяет колонку, содержащую только символы 'X'.
     */
    @Test
    public void whenHasMonoVertical() {
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
     * Проверяет, что метод {@link MatrixCheck#monoVertical(char[][], int)}
     * корректно определяет колонку, не состоящую только из символов 'X'.
     */
    @Test
    public void whenHasNotMonoVertical() {
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
     * Проверяет, что метод {@link MatrixCheck#extractDiagonal(char[][])}
     * корректно извлекает диагональ, содержащую только символы 'X'.
     */
    @Test
    public void whenDiagonalFullX() {
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
     * Проверяет, что метод {@link MatrixCheck#extractDiagonal(char[][])}
     * корректно извлекает диагональ, содержащую только символы '1'.
     */
    @Test
    public void whenDiagonalFullOne() {
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
     * Проверяет, что метод {@link MatrixCheck#extractDiagonal(char[][])}
     * корректно извлекает диагональ, содержащую различные символы.
     */
    @Test
    public void whenDiagonalMix() {
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
     * Проверяет, что метод {@link MatrixCheck#isWin(char[][])}
     * правильно определяет выигрышную ситуацию по вертикали.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
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
     * Проверяет, что метод {@link MatrixCheck#isWin(char[][])}
     * правильно определяет отсутствие выигрышной ситуации по вертикали.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
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
     * Проверяет, что метод {@link MatrixCheck#isWin(char[][])}
     * правильно определяет выигрышную ситуацию по горизонтали.
     */
    @Test
    public void whenDataHMonoByTrueThenTrue() {
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
     * Проверяет, что метод {@link MatrixCheck#isWin(char[][])}
     * корректно определяет отсутствие выигрышной ситуации на диагонали.
     */
    @Test
    public void whenDataDiagMonoIsTrueThenFalse() {
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
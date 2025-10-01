package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code EqualLastTest} для проверки метода
 * {@link EqualLast#check(int[], int[])} в классе {@link EqualLast}.
 *
 * <p>Тестируется корректность определения совпадения последних элементов двух
 * массивов.</p>
 *
 * <p>Проверяются различные случаи, включая пустые массивы.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * int[] left = {1, 2, 3};
 * int[] right = {5, 4, 3};
 * boolean result = EqualLast.check(left, right);
 * assertThat(result).isTrue();
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class EqualLastTest {

    /**
     * Проверяет, когда последние элементы массивов равны.
     *
     * <p>Ожидаемый результат: {@code true}.</p>
     */
    @Test
    public void whenEqual() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isTrue();
    }

    /**
     * Проверяет, когда последние элементы массивов не равны.
     *
     * <p>Ожидаемый результат: {@code false}.</p>
     */
    @Test
    public void whenNotEqual() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }

    /**
     * Проверяет, когда первый массив пустой.
     *
     * <p>Ожидаемый результат: {@code false}.</p>
     */
    @Test
    public void whenLeftIsEmpty() {
        int[] left = {};
        int[] right = {3, 3, 4};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }

    /**
     * Проверяет, когда второй массив пустой.
     *
     * <p>Ожидаемый результат: {@code false}.</p>
     */
    @Test
    public void whenRightIsEmpty() {
        int[] left = {1, 2, 3};
        int[] right = {};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }

    /**
     * Проверяет, когда оба массива пустые.
     *
     * <p>Ожидаемый результат: {@code false}.</p>
     */
    @Test
    public void whenBothEmpty() {
        int[] left = {};
        int[] right = {};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }
}

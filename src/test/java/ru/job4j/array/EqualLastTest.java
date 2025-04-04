package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code EqualLastTest} для проверки метода {@link EqualLast#check(int[], int[])}
 * в классе {@link EqualLast}.
 *
 * <p>Тестируется корректность определения совпадения последних элементов двух массивов.</p>
 * <p>Проверяются различные случаи, включая пустые массивы.</p>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-28
 */
public class EqualLastTest {

    /**
     * Тест, когда последние элементы массивов равны.
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
     * Тест, когда последние элементы массивов не равны.
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
     * Тест, когда первый массив пустой.
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
     * Тест, когда второй массив пустой.
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
     * Тест, когда оба массива пустые.
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